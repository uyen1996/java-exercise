package com.javafortesters;

public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String setUsername(String username) {
        this.username = username;
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        this.password = password;
        return password;
    }

    public User() {
        username = "username";
        password = "password";
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
