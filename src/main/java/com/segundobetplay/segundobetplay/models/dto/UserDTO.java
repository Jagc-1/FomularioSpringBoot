package com.segundobetplay.segundobetplay.models.dto;

import com.segundobetplay.segundobetplay.models.User;

public class UserDTO {
    private String titulo;
    private User user;
    
    public UserDTO() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
