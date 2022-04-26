package com.hui.xiaomi.dao;

import com.hui.xiaomi.pojo.Cart;
import com.hui.xiaomi.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface OrderMapper {
    int createOrder(@Param("orderId") String orderId, @Param("orderTime") Date orderTime, @Param("orderMoney") Double orderMoney, @Param("cart") Cart cart);
    List<Order> selectAllOrdersById(Integer customerId);
    int deleteBatchOrders(String[] orderId);
    List<Order> selectAllOrders();
    List<Order> selectAllOrdersPageList(Integer customerId);
}
