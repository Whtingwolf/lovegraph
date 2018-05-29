package com.withing.lovegraph.service;

import com.withing.lovegraph.domain.User;

import java.util.List;

public interface UserService {
    User findUserById(long id);

    List<User> getFollowersByUsers(String username);

    List<User> getConcernerByUsers(String username);

    boolean modifyPassword(String password);

    List<User> findUsersByUsername();

}
