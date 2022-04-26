package com.hui.xiaomi.service;

import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.pojo.Cart;
import com.hui.xiaomi.pojo.Order;

import java.text.ParseException;
import java.util.List;

public interface OrderService {
    int createOrder(Cart cart) throws ParseException;
    List<Order> selectAllOrderById(Integer customerId);
    int deleteBatchOrders(String[] orderId);
    List<Order> selectAllOrders();
    PageInfo<Order> selectAllOrdersPageList(Integer customerId,Integer pageNum,Integer pageSize);
}
