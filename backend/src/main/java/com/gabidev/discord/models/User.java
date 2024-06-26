package com.gabidev.discord.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;

    @Column(nullable = false, length = 250)
    private String nome;

    @Column(nullable = false, length = 250)
    private String username;

    @Column(nullable = false, length = 250)
    private String email;

    @Column(nullable = false, length = 250)
    private String passwd;

    @Column(nullable = false, length = 250)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNasc;

    

    public User() {
    }

    public User(UUID id, String nome, String username, String email, String passwd, LocalDate dataNasc) {
        this.id = id;
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.passwd = passwd;
        this.dataNasc = dataNasc;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswd() {
        return passwd;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}
