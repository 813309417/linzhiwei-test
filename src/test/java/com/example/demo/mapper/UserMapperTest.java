package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
//web项目，junit需要模拟servletContext，所以要加@webAppConfiguration
@WebAppConfiguration
//告诉Junit Spring配置文件
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void findById() throws Exception {
        Long id = 1l;
        User user = userMapper.findById(id);
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }

    @Test
    public void insertUser() throws Exception {

        User user = new User();

        user.setName("测试2");
        user.setAge(12);

        int flag = userMapper.insertUser(user);

        System.out.println(flag);

    }

    @Test
    public void updateUser() throws Exception {

        User user = new User();

        user.setId(1l);
        user.setName("修改测试2");
        user.setAge(13);

        int flag = userMapper.updateUser(user);

        System.out.println(flag);

    }

//    @Test
//    public void deleteUser() throws Exception {
//
//        Long id = 1l;
//
//        int flag = userMapper.deleteUser(id);
//
//        System.out.println(flag);
//
//    }

}
