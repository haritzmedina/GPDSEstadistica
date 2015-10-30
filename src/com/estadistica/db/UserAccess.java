package com.estadistica.db;

/**
 * Created by Haritz on 30/10/2015.
 */
public class UserAccess {

    public UserAccess(){
        DBConnection.connect();
        DBConnection.createTable();
    }

    public void createUser(String username, String pass){
        if(!this.userExists(username)){
            DBConnection.insertUser(username, pass);
        }
    }

    public void deleteUser(String username){
        DBConnection.deleteUser(username);
    }

    public boolean userLogin(String username, String pass){
        User user = DBConnection.selectUser(username);
        if(user==null){
            return false;
        }
        return user.getPass().compareTo(pass)==0;
    }

    public boolean userExists(String username){
        User user = DBConnection.selectUser(username);
        return user!=null;
    }
}
