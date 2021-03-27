package com.gai.service;

import com.gai.pojo.Cart;

public interface OrderService {
    public String createOrder(Cart cart, Integer userId);
}
