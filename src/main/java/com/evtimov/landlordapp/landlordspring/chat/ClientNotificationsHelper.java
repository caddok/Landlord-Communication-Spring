package com.evtimov.landlordapp.landlordspring.chat;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.gson.JsonObject;
import okhttp3.*;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class ClientNotificationsHelper {
    private static String SCOPE = "https://www.googleapis.com/auth/firebase.messaging";
    private static String FCM_ENDPOINT =
            "https://fcm.googleapis.com/v1/projects/landlordproject/messages:send";

    public static void main(String args[]) {
        ClientNotificationsHelper fcmMessage =
                new ClientNotificationsHelper();

        // fcmMessage.sendNotification();
        fcmMessage.sendData();
    }

    private void sendData() {
        sendMessageToFcm(getFCMDataMessage());
    }

    private void sendMessageToFcm(String jsonMessage) {
        final MediaType mediaType = MediaType.parse("application/json");

        OkHttpClient httpClient = new OkHttpClient();
        try {
            Request request = new Request.Builder().url(FCM_ENDPOINT)
                    .addHeader("Content-Type", "application/json; UTF-8")
                    .addHeader("Authorization", "Bearer " + getAccessToken())
                    .post(RequestBody.create(mediaType, jsonMessage)).build();

            Response response = httpClient.newCall(request).execute();
            if (response.isSuccessful()) {
                if (response.body() != null) {
                    log.info("Message has been sent to FCM server "
                            + response.body().string());
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private static String getAccessToken() throws IOException {
        GoogleCredential googleCredential = GoogleCredential
                .fromStream(new FileInputStream(""))
                .createScoped(Collections.singletonList(SCOPE));
        googleCredential.refreshToken();
        return googleCredential.getAccessToken();
    }

    private String getFCMDataMessage() {

        AbstractReadWriteAccess.Item item = getClientTokenAndData();

        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("token", item.getToken());

        JsonObject itemInfo = new JsonObject();
        itemInfo.addProperty("itemName", item.getItemName());
        itemInfo.addProperty("itemPrice", item.getItemPrice());
        itemInfo.addProperty("location", item.getLocation());

        jsonObj.add("data", itemInfo);

        JsonObject msgObj = new JsonObject();
        msgObj.add("message", jsonObj);

        log.info("data  message " + msgObj.toString());

        return msgObj.toString();
    }


    private AbstractReadWriteAccess.Item getClientTokenAndData() {
        AbstractReadWriteAccess.Item item = new AbstractReadWriteAccess.Item();
        item.setToken("ci7d7xsQY24:APA91bGWrwTgA");
        item.setItemName("HP Laptop");
        item.setItemPrice("$1300");
        item.setLocation("Bellevue");
        return item;
    }

    private String getClientToken() {
        return "ci7d7xsQY24:APA91bGWrwTgA";
    }

}
