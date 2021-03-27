package com.gai.test;

import com.gai.pojo.User;
import com.gai.service.UserService;
import com.gai.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void registUser() {
        userService.registUser(new User(null, "666", "666", "66@qq.com"));
        userService.registUser(new User(null, "888", "888", "888@qq.com"));

    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null, "123", "123", null)));
    }

    @Test
    public void existsUsername() {
        if (userService.existsUsername("1234")) {
            System.out.println("用户名存在");
        } else {
            System.out.println("用户名可用");
        }
    }
}