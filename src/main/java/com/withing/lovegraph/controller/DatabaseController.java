package com.withing.lovegraph.controller;

import com.withing.lovegraph.dao.IUserDao;
import com.withing.lovegraph.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DatabaseController {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseController.class);

    @Autowired
    private IUserDao userService;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/getUser")
    public List <Map <String, Object>> getUser ( ) {
        String sql = "select * from lovegraph_user";
        List <Map <String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @RequestMapping(value = "/UserList")
    public List<User> getUserList(){
        return userService.findAll();
    }

}
