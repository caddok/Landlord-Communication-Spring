package com.evtimov.landlordapp.landlordspring.services;

import com.evtimov.landlordapp.landlordspring.models.Chatsession;
import com.evtimov.landlordapp.landlordspring.repositories.base.ChatSessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatSessionService {
    private final ChatSessionRepo repository;

    @Autowired
    public ChatSessionService(ChatSessionRepo repository) {
        this.repository = repository;
    }

    public List<Chatsession> getAllByUserId(int id) {
        return null;
    }

    public void createSession(Chatsession session){

    }

    public void deleteUselessSession(int id) {

    }

}
