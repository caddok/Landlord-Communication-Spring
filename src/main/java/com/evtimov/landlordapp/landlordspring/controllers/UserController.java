package com.evtimov.landlordapp.landlordspring.controllers;

import com.evtimov.landlordapp.landlordspring.models.User;
import com.evtimov.landlordapp.landlordspring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    //Test method
    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public Optional<User> getMovieById(@PathVariable(value = "userId") @Valid int id){
        return service.findUserByUsername(id);
    }
}
