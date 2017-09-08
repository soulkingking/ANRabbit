package com.anrabbit.entity;

import java.io.Serializable;

import javax.inject.Inject;

/**
 * Created by soul on 2017/9/4.
 */

public class User implements Serializable {
    private String username;
    private String password;
    private String token;

    @Inject
    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
