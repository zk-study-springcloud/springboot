package com.zk.springboot.jpa.dao;

import com.zk.springboot.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
