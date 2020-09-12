package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public User findById(Long id){
        return userMapper.findById(id);
    }

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    public int deleteUser(Long id) {
        return userMapper.deleteUser(id);
    }

}
