package com.gai.web;

import com.gai.pojo.Cart;
import com.gai.pojo.User;
import com.gai.service.OrderService;
import com.gai.service.impl.OrderServiceImpl;
import com.gai.utils.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OrderServlet extends BaseServlet {
    private OrderService orderService = new OrderServiceImpl();

    //生成订单
    protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        User loginUser = (User) req.getSession().getAttribute("user");
        if (loginUser == null) {
            req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
            return;
        }
        System.out.println("OrderServlet程序在[" + Thread.currentThread().getName() + "]中");
        Integer userId = loginUser.getId();
        String orderId = orderService.createOrder(cart, userId);
        //req.setAttribute("orderId", orderId);
        req.getSession().setAttribute("orderId", orderId);
        //重定向
        resp.sendRedirect(req.getContextPath() + "/pages/cart/checkout.jsp");
    }
}
