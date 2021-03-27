package com.gai.test;

import com.gai.dao.OrderDao;
import com.gai.dao.impl.OrderDaoImpl;
import com.gai.pojo.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

public class OrderDaoImplTest {

    @Test
    public void saveOrder() {
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.saveOrder(new Order("123456", new Date(), new BigDecimal(100), 0, 1));
    }
}