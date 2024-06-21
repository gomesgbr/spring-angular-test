package com.gabidev.discord.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabidev.discord.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
