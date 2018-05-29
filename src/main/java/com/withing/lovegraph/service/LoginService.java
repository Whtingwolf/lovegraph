package com.withing.lovegraph.service;

import com.withing.lovegraph.domain.User;

public interface LoginService {
    User login(String username,String password);
    void loginout(User user);
}
