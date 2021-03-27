package com.gai.dao;

import com.gai.pojo.User;

public interface UserDao {


    //根据用户名查询用户信息
    public User queryUserByUsername(String username);

    public User queryUserByUsernameAndPassword(String username, String password);

    //保存用户信息
    public int saveUser(User user);


}
