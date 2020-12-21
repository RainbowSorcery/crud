package com.rainbow.dao;

import com.rainbow.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Insert("INSERT INTO `user`(username, `password`, age, sex) VALUES(#{username}, #{password}, #{age}, #{sex})")
    void addUser(User user);


    @Delete("delete FROM user WHERE id = #{userId}")
    void deleteById(Integer userId);

    @Select("SELECT * FROM user WHERE id = #{userId}")
    User findUserById(Integer userId);

    @Update("update user SET username = #{username}, password = #{password}, age = #{age}, sex = #{sex} WHERE id = #{id}")
    void updateUser(User user);
}
