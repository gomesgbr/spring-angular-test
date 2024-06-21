package com.gabidev.discord.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabidev.discord.models.User;
import com.gabidev.discord.services.UserService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/User")
public class UserController {
    
    @Autowired
    private UserService userService;


    @PostMapping
    public ResponseEntity<Object> saveUser(@RequestBody User user){
        var userToSave = new User();
        BeanUtils.copyProperties(user, userToSave);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userToSave));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll()); 
    }
}
