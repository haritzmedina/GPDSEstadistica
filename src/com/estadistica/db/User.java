package com.estadistica.db;

/**
 * Created by Haritz on 30/10/2015.
 */
public class User {
    private String user;
    private String pass;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public User(String user, String pass) {

        this.pass = pass;
        this.user = user;
    }
}
