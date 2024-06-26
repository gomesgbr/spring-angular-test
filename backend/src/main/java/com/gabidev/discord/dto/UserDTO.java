package com.gabidev.discord.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gabidev.discord.models.User;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    
    private UUID id;

    @NotNull
    @Size(max = 250)
    private String nome;

    @NotNull
    @Size(max = 250)
    private String username;

    @NotNull
    @Size(max = 250)
    private String email;

    @NotNull
    @Size(max = 250)
    private String passwd;

    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNasc;

    public UserDTO(User obj){

        this.id = obj.getId();
        this.nome = obj.getNome();
        this.username = obj.getUsername();
        this.email = obj.getEmail();
        this.passwd = obj.getPasswd();
        this.dataNasc = obj.getDataNasc();
    }

    public UserDTO(){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    
}
