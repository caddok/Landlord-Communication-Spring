package com.evtimov.landlordapp.landlordspring.services;


import com.evtimov.landlordapp.landlordspring.models.User;
import com.evtimov.landlordapp.landlordspring.repositories.base.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void registerUser(User user) {
        repository.save(user);
    }

    //Under question; must ask the clients
    public void deleteUser(int id){}

    public List<User> findAllTenants(){
        return new ArrayList<>();
    }

    public List<User> findAllLandlords(){
        return new ArrayList<>();
    }

    public String findUserByUsername(String pattern){
        return new String();
    }

    public List<User> findUsersByRating(String pattern){
        return new ArrayList<>();
    }

    public void updateUserData(User user){

    }
}
