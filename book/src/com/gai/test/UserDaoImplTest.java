package com.gai.test;

import com.gai.dao.UserDao;
import com.gai.dao.impl.UserDaoImpl;
import com.gai.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUsername() {

        if (userDao.queryUserByUsername("admin12") == null) {
            System.out.println("用户名可用");
        } else {
            System.out.println("用户名已存在");
        }
    }


    @Test
    public void queryUserByUsernameAndPassword() {
        if (userDao.queryUserByUsernameAndPassword("admin", "admin") == null) {
            System.out.println("用户名密码错误");
        } else {
            System.out.println("查询成功");
        }
    }

    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new User(null, "123", "123", "123@qq.com")));
    }
}