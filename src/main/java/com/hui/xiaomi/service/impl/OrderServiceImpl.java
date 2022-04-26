package com.hui.xiaomi.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.dao.OrderMapper;
import com.hui.xiaomi.pojo.Cart;
import com.hui.xiaomi.pojo.Order;
import com.hui.xiaomi.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    OrderMapper orderMapper;
    @Override
    public int createOrder(Cart cart) throws ParseException {
        Date orderTime = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(orderTime);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date nowTime = sf.parse(time);
        double orderMoney = (cart.getCartNum())*(cart.getGoodsPrice());
        UUID uuid = UUID.randomUUID();
        String orderId = uuid.toString();
        int rows = orderMapper.createOrder(orderId,nowTime,orderMoney,cart);
        return rows;
    }

    @Override
    public List<Order> selectAllOrderById(Integer customerId) {
        List<Order> orders = orderMapper.selectAllOrdersById(customerId);
        return orders;
    }

    @Override
    public int deleteBatchOrders(String[] orderId) {
        int rows = orderMapper.deleteBatchOrders(orderId);
        return rows;
    }

    @Override
    public List<Order> selectAllOrders() {
        List<Order> orders = orderMapper.selectAllOrders();
        return orders;
    }

    @Override
    public PageInfo<Order> selectAllOrdersPageList(Integer customerId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Order> orders = orderMapper.selectAllOrdersPageList(customerId);
        PageInfo<Order> pageInfo = new PageInfo<>(orders);
        return pageInfo;
    }
}
