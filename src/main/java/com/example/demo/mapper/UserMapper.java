package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findById(Long id);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(Long id);

}
