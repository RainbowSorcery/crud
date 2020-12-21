package com.rainbow.service.impl;

import com.rainbow.dao.UserMapper;
import com.rainbow.entity.User;
import com.rainbow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAll();
    }

    @Override
    public void createUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void deleteById(Integer userId) {

        userMapper.deleteById(userId);
    }

    @Override
    public User findUserById(Integer userId) {
        if(userMapper.findUserById(userId) == null) {
            throw new RuntimeException("用户不存在");
        }
        return userMapper.findUserById(userId);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
