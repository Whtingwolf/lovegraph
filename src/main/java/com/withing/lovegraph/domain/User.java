package com.withing.lovegraph.domain;

public class User {
    private String userID;
    private String username;
    private String password;
    private String numberphone;

    public User ( ) {
    }

    public String getUsername ( ) {
        return username;
    }

    public String getUserID ( ) {
        return userID;
    }

    public User setUserID (String userID) {
        this.userID = userID;
        return this;
    }

    public String getPassword ( ) {

        return password;
    }

    public String getNumberphone ( ) {
        return numberphone;
    }

    public User setUsername (String username) {
        this.username = username;
        return this;
    }

    public User setPassword (String password) {
        this.password = password;
        return this;
    }

    public User setNumberphone (String numberphone) {
        this.numberphone = numberphone;
        return this;
    }
}
