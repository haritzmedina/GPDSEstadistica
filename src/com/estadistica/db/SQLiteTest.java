package com.estadistica.db;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Haritz on 30/10/2015.
 */
public class SQLiteTest {

    private static String USER = "Pepito";
    private static String PASS = "pepito1";

    @Test
    public void userTest(){
        // Create connector
        UserAccess userAccess = new UserAccess();
        // Create user
        userAccess.createUser(USER, PASS);
        // Check if user exists
        assertTrue(userAccess.userExists(USER));
        // Check if can login
        assertTrue(userAccess.userLogin(USER, PASS));
        // Remove user
        userAccess.deleteUser(USER);
        // Check user don't exists
        assertFalse(userAccess.userExists(USER));
    }

}