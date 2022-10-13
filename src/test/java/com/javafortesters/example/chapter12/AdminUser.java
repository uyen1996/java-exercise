package com.javafortesters.example.chapter12;

import org.junit.Test;

public class AdminUser extends User {

    public AdminUser(String username, String password){
        super(username, password);

    }
    public AdminUser(){
        this("adminuser", "password");
    }

    @Override
    public String getPermission(){
        return "Elevated";
    }


}
