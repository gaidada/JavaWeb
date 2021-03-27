package com.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("servlet1的参数username=" + username);
        //传递到servlet2
        request.setAttribute("key1", "servlet1章");
        //servlet2的地址，斜杠打头
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet2");
        //去servlet2
        requestDispatcher.forward(request, response);
    }
}
