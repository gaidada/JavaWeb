package com.servlet;

import com.google.gson.Gson;
import com.pojo.Person;
import jdk.jfr.Percentage;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AjaxServlet extends BaseServlet {
    protected void javaScriptAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ajax请求过来了");

        Person person = new Person(1, "gai");
        //json格式的字符串
        Gson gson = new Gson();
        String jsonString = gson.toJson(person);
        resp.getWriter().write(jsonString);
    }

    protected void jQueryAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryAjax请求过来了");

        Person person = new Person(1, "gai");
        //json格式的字符串
        Gson gson = new Gson();
        String jsonString = gson.toJson(person);
        resp.getWriter().write(jsonString);
    }

    protected void jQueryGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryGet");

        Person person = new Person(1, "gai");
        //json格式的字符串
        Gson gson = new Gson();
        String jsonString = gson.toJson(person);
        resp.getWriter().write(jsonString);
    }

    protected void jQueryPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryPost");

        Person person = new Person(1, "gai");
        //json格式的字符串
        Gson gson = new Gson();
        String jsonString = gson.toJson(person);
        resp.getWriter().write(jsonString);
    }

    protected void jQuerySerialize(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQuerySerialize");

        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));

        Person person = new Person(1, "gai");
        //json格式的字符串
        Gson gson = new Gson();
        String jsonString = gson.toJson(person);
        resp.getWriter().write(jsonString);
    }
}
