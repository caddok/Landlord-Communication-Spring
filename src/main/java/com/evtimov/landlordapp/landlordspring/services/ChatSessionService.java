package com.evtimov.landlordapp.landlordspring.services;

import com.evtimov.landlordapp.landlordspring.models.Chatsession;
import com.evtimov.landlordapp.landlordspring.repositories.base.ChatSessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ChatSessionService {
    private final ChatSessionRepo repository;

    @Autowired
    public ChatSessionService(ChatSessionRepo repository) {
        this.repository = repository;
    }

    public List<Chatsession> getAllByUserId(int id) {
        List<Chatsession> allSessions = repository.findAll();

        return allSessions.stream()
                .filter(s->s.getUsers().contains(id))
                .collect(toList());
    }

    public void createSession(Chatsession session){
        repository.save(session);
    }

    public void deleteUselessSession(Chatsession session) {
        repository.delete(session);
    }

}
