package com.zk.springboot.jpa.service;

import com.zk.springboot.jpa.dao.UserDao;
import com.zk.springboot.jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserDao userRepository;

    public User findUserByName(String username) {
        return userRepository.findByUsername(username);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public User findUserById(long id) {
        Optional<User> one = userRepository.findById(id);
        return one.get();
    }
    public User updateUser(User user) {
        return userRepository.saveAndFlush(user);
    }
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
