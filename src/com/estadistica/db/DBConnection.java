package com.estadistica.db;

import java.sql.*;


/**
 * Created by Haritz on 30/10/2015.
 */
public class DBConnection {

    public static String DATABASE_FILE_NAME = "users.db";
    private static Connection connection = null;

    public static void connect() {

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:"+DATABASE_FILE_NAME);
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

    public static void closeConnection(Connection c){
        try {
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable() {
        Statement stat = null;
        try {
            stat = connection.createStatement();
            stat.executeUpdate("create table if not exists users (user, pass);");
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertUser(String user, String pass){
        try {
            PreparedStatement prep = connection.prepareStatement("insert into users values (?, ?);");
            prep.setString(1, user);
            prep.setString(2, pass);
            prep.addBatch();
            connection.setAutoCommit(false);
            prep.executeBatch();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static User selectUser(String username){
        Statement stat = null;
        User user = null;
        try {
            stat = connection.createStatement();
            ResultSet rs = stat.executeQuery("select * from users;");
            while(rs.next()){
                if(rs.getString("user").compareTo(username)==0){
                    user = new User(rs.getString("user"), rs.getString("pass"));
                }
            }
            rs.close();
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public static void deleteUser(String username){
        Statement stat = null;
        try {
            stat = connection.createStatement();
            stat.executeUpdate("delete from users where user='"+username+"'");
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
