package com.evtimov.landlordapp.landlordspring.chat;

import com.evtimov.landlordapp.landlordspring.models.Message;
import com.evtimov.landlordapp.landlordspring.repositories.base.MessageRepo;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import okhttp3.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

@Service
public class ChatService {
    private final MessageRepo messageRepo;

    private static String SCOPE = "https://www.googleapis.com/auth/firebase.messaging";
    private static String FCM_ENDPOINT =
            "https://fcm.googleapis.com/v1/projects/landlordproject/messages:send";


    @Autowired
    public ChatService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public void saveMessage(Message message) {
        messageRepo.save(message);
    }

    public void sendMessage(JSONObject messageDTO) {
        sendMessageToFcm((String)messageDTO.get("body"), (String)messageDTO.get("to"));
    }

    private void sendMessageToFcm(String body, String receiver) {
        final MediaType mediaType = MediaType.parse("application/json");

        OkHttpClient httpClient = new OkHttpClient();
        try {
            Request request = new Request.Builder().url(FCM_ENDPOINT)
                    .addHeader("Content-Type", "application/json; UTF-8")
                    .addHeader("Authorization", "Bearer " + getAccessToken())
                    .addHeader("receiver",receiver)
                    .post(RequestBody.create(mediaType, body)).build();
            Response response = httpClient.newCall(request).execute();
            if (response.isSuccessful()) {
                if (response.body() != null) {
                    response.newBuilder();
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private String getAccessToken() throws IOException {
        GoogleCredential googleCredential = GoogleCredential
                .fromStream(new FileInputStream("landlordproject-7f76e-firebase-adminsdk-r0bce-b0a9d66e6b.json"))
                .createScoped(Collections.singletonList(SCOPE));
        googleCredential.refreshToken();
        return googleCredential.getAccessToken();
    }
}
