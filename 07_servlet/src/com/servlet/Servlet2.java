package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("servlet2的username=" + username);
        //查看servlet1
        Object key1 = request.getAttribute("key1");
        System.out.println("servlet1的key=" + key1);
        //处理自己的业务
        System.out.println("servlet2处理中");
    }
}
