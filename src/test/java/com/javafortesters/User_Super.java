package com.javafortesters;

public class User_Super {
    private String userName;
    private String passWord;
    private int old;

    public User_Super() {

    }
    public User_Super(String userName, String passWord, int old) {
        this.userName = userName;
        this.passWord = passWord;
        this.old = old;
    }

    public User_Super(String userName, String passWord) {
        setUserName(userName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (checkUserName(userName)) {
            this.userName = userName;
        }
    }

    protected boolean checkUserName(String userName) {
        if (userName.toLowerCase().contains("admin")) {
            System.out.println("Pls don't input admin user");
            return false;
        } else {
            return true;
        }
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        if (userName.toLowerCase().contains("admin")) {
            System.out.println("Pls don't input admin pass");
        } else {
            this.passWord = passWord;
        }
    }
}
