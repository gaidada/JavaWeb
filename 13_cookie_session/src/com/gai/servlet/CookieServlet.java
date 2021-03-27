package com.gai.servlet;

import com.gai.util.CoolieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends BaseServlet {

    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建cookie对象
        Cookie cookie1 = new Cookie("key1", "value1");
        Cookie cookie2 = new Cookie("name", "gau");

        //通知客户端保存cookie
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);

        resp.getWriter().write("cooke创建成功");
    }

    //    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie cookie = new Cookie("name", "gai");
//        resp.addCookie(cookie);
//        resp.getWriter().write("cookie修改");
//    }
    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = CoolieUtils.findCookie("name", req.getCookies());
        if (cookie != null) {
            cookie.setValue("gei");
            resp.addCookie(cookie);
        }
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        Cookie iWantCoolie = CoolieUtils.findCookie("name", cookies);
//        for (Cookie cookie : cookies) {
//            resp.getWriter().write("cookie[" + cookie.getName() + "=" + cookie.getValue() + "]<br/>");
//            if ("name".equals(cookie.getName())) {
//                iWantCoolie = cookie;
//                break;
//            }
//        }
        //找到了需要的cookie
        if (iWantCoolie != null) {
            resp.getWriter().write("cookie find");
        }
    }

    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("defalutLife", "defalutLife");
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);
    }

    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = CoolieUtils.findCookie("name", req.getCookies());
        if (cookie != null) {
            cookie.setMaxAge(0);//不用等待浏览器关闭马上删除
            resp.addCookie(cookie);
            resp.getWriter().write("delete cookie");
        }
    }

    protected void life(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("life", "life");
        cookie.setMaxAge(3600);
        resp.addCookie(cookie);
        resp.getWriter().write("3600");
    }

    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("path1", "path1");
        //getContextPath()得到工程路径
        cookie.setPath(req.getContextPath() + "/abc");
        resp.addCookie(cookie);
        resp.getWriter().write("path cookie");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
