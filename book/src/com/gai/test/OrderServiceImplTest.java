package com.gai.test;

import com.gai.pojo.Cart;
import com.gai.pojo.CartItem;
import com.gai.service.OrderService;
import com.gai.service.impl.OrderServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrderServiceImplTest {

    @Test
    public void createOrder() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1, "java入门", 1, new BigDecimal(1000), new BigDecimal(1000)));
        cart.addItem(new CartItem(2, "python", 1, new BigDecimal(100), new BigDecimal(200)));
        OrderService orderService = new OrderServiceImpl();
        System.out.println(orderService.createOrder(cart, 1));
    }
}