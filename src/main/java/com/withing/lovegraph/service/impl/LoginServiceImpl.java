package com.withing.lovegraph.service.impl;

import com.withing.lovegraph.domain.User;
import com.withing.lovegraph.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginServiceImpl implements LoginService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public User login (String username, String password) {
        return null;
    }

    @Override
    public void loginout (User user) {

    }
}
