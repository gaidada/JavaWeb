package com.gai.test;

import com.gai.dao.OrderItemDao;
import com.gai.dao.impl.OrderItemDaoImpl;
import com.gai.pojo.OrderItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrderItemDaoImplTest {

    @Test
    public void saveOrderItem() {
        OrderItemDao orderItemDao = new OrderItemDaoImpl();
        orderItemDao.saveOrderItem(new OrderItem(null, "java", 1, new BigDecimal(100), new BigDecimal(100), "123456"));
        orderItemDao.saveOrderItem(new OrderItem(null, "python", 2, new BigDecimal(100), new BigDecimal(100), "123456"));
    }
}