package com.withing.lovegraph.dao;

import com.withing.lovegraph.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IUserDao extends JpaRepository<User,String> {
}
