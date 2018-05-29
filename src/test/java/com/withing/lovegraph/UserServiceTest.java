package com.withing.lovegraph;

import com.withing.lovegraph.domain.User;
import com.withing.lovegraph.service.UserService;
import com.withing.lovegraph.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.jws.Oneway;

import static org.junit.Assert.assertNotNull;

public class UserServiceTest extends UserServiceImpl {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void test(){
        User user = findUserById(100000);
        assertNotNull(user);
    }
}
