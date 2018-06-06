package com.withing.lovegraph.domain;

import javax.persistence.*;

@Entity
@Table(name = "lovegraph_user")
public class User {
    private static final long serialVersionUID = 8127035730921338189L;

    @Id
    @GeneratedValue
    @Column(name = "T_ID")
    private String userID;

    @Column(name = "T_USERNAME")
    private String username;

    @Column(name = "T_PASSWORD")
    private String password;

    @Column(name = "T_NUMBERPHONE")
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
