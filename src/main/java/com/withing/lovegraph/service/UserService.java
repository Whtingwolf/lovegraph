package com.withing.lovegraph.service;

import com.withing.lovegraph.domain.User;

import java.util.List;

public interface UserService {
    User findUserById();
    List<User> getFollowersByUsers();
    List<User> getConcernerByUsers();
    boolean modifyPassword();
    List<User> findUsersByUsername();
}
