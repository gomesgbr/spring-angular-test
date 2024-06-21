package com.gabidev.discord.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabidev.discord.models.User;
import com.gabidev.discord.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
