package com.gai.test;

import java.lang.reflect.Method;

public class UserServletTest {
    public void login() {
        System.out.println("login方法");
    }

    public void regist() {
        System.out.println("regist方法");
    }

    public void update() {
        System.out.println("update方法");
    }

    public static void main(String[] args) {
        String action = "login";
        try {
            //获取action业务鉴别字符串，获取相应的业务方法反射对象
            Method method = UserServletTest.class.getDeclaredMethod(action);
            System.out.println(method);
            //调用目标业务方法
            method.invoke(new UserServletTest());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
