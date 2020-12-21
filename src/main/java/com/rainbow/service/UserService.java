package com.rainbow.service;

import com.rainbow.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser();

    void createUser(User user);

    void deleteById(Integer userId);

    User findUserById(Integer userId);

    void updateUser(User user);
}
