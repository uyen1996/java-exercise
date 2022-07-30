package com.javafortesters;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class User {
    private String username;
    private String password;
    public User(){
        username = "username";
        password = "password";
    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
