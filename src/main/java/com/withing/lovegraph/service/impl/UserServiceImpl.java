package com.withing.lovegraph.service.impl;

import com.withing.lovegraph.domain.User;
import com.withing.lovegraph.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public User findUserById (long id) {
        String sql = "select * from lovegraph_user where t_id = "+id;
        User user = (User)jdbcTemplate.queryForObject(sql, new RowMapper <User>() {
            @Override
            public User mapRow (ResultSet rs, int rowNum) throws SQLException {
                    return  new User()
                .setUsername(rs.getString("t_username"))
                .setUserID(rs.getString("t_id"))
                .setNumberphone(rs.getString("t_numberphone"));

            }
        });
        System.out.println(user==null);
//        User user = jdbcTemplate.queryForObject(sql,(rs, rowNum) ->
//                new User()
//                .setUsername(rs.getString("t_username"))
//                .setUserID(rs.getString("t_id"))
//                .setNumberphone(rs.getString("t_numberphont"))
//        );
        return user;
    }

    @Override
    public List <User> getFollowersByUsers (String username) {
        return null;
    }

    @Override
    public List <User> getConcernerByUsers (String username) {
        return null;
    }

    @Override
    public boolean modifyPassword (String password) {
        return false;
    }

    @Override
    public List <User> findUsersByUsername ( ) {
        return null;
    }
}
