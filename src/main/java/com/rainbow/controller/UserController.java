package com.rainbow.controller;

import com.rainbow.commons.Result;
import com.rainbow.commons.StatusCode;
import com.rainbow.entity.User;
import com.rainbow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAllUser")
    public Result<List<User>> findAllUser() {
        return new Result<>(StatusCode.ok, true, userService.findAllUser(), "查询全部用户成功");
    }

    @PostMapping("/createUser")
    public Result<String> createUser(@RequestBody User user) {
        userService.createUser(user);

        return new Result<>(StatusCode.ok, true, "用户添加成功.");
    }

    @DeleteMapping("/deleteUserById/{userId}")
    public Result<String> deleteUserById(@PathVariable Integer userId) {
        userService.deleteById(userId);

        return new Result<>(StatusCode.ok, true, "用户删除成功.");
    }

    @GetMapping("/findUserByid/{userId}")
    public Result<User> findUserById(@PathVariable Integer userId) {
        User user = userService.findUserById(userId);

        return new Result<>(StatusCode.ok, true,  user, "根据用户id查询用户成功.");
    }

    @PutMapping("/updateUser")
    public Result<User> updateUser(@RequestBody User user) {
        userService.updateUser(user);

        return new Result<>(StatusCode.ok, true, "用户更新成功.");
    }
}
