package com.hui.xiaomi.controller;

import com.github.pagehelper.PageInfo;
import com.hui.xiaomi.pojo.Cart;
import com.hui.xiaomi.pojo.Order;
import com.hui.xiaomi.service.OrderService;
import com.hui.xiaomi.vo.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("action")
public class OrderController {
    @Resource
    OrderService orderService;
    @RequestMapping("/createOrder")
    public Result createOrder(@RequestBody Cart cart) throws ParseException {
        int rows = orderService.createOrder(cart);
        if (rows!=0){
            return new Result(true,"订单生成成功");
        }
        return new Result(false,"订单生成失败");
    }
    @RequestMapping("/selectAllOrdersById")
    public Result selectAllOrder(Integer customerId){
        List<Order> orders = orderService.selectAllOrderById(customerId);
        return new Result(true,"查询成功",orders);
    }
    @RequestMapping("/deleteBatchOrders")
    public Result deleteBatchOrders(@RequestBody String[] orderId){
        int rows = orderService.deleteBatchOrders(orderId);
        if (rows!=0){
            return new Result(true,"删除订单成功");
        }
        return new Result(false,"删除订单失败");
    }
    @RequestMapping("/selectAllOrders")
    public Result selectAllOrders(){
        List<Order> orders = orderService.selectAllOrders();
        return new Result(true,"查询成功",orders);
    }
    @RequestMapping("selectAllOrdersPageList")
    public Result selectAllOrdersPageList(Integer customerId, @RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "3") Integer pageSize){
        PageInfo<Order> pageInfo = orderService.selectAllOrdersPageList(customerId, pageNum, pageSize);
        return new Result(true,"订单分页成功",pageInfo);
    }
}
