package com.bogus.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    //retrieveAllUsers
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }
    //retrieveUser
    @GetMapping("/user/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }
}
