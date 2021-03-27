package com.servlet;

import com.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class SerachStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取请求的参数
        //发sql语句查询学生的信息
        ArrayList<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            studentList.add(new Student(i + 1, "name" + i, 18 + i, "138" + i));
        }
        //保存查询到的结果到request域中
        req.setAttribute("stuList", studentList);
        //请求转发到jsp页面
        req.getRequestDispatcher("/text/showStu.jsp").forward(req, resp);
    }
}
