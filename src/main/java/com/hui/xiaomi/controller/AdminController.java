package com.hui.xiaomi.controller;

import com.hui.xiaomi.pojo.Customer;
import com.hui.xiaomi.service.CustomerService;
import com.hui.xiaomi.vo.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    CustomerService customerService;
    @RequestMapping("/selectAllCustomer")
    public Result selectAllCustomer(){
        List<Customer> customers = customerService.selectAllCustomer();
        return new Result(true,"查询成功",customers);
    }
    @RequestMapping("/deleteBatchCustomer")
    public Result deleteBatchCustomer(@RequestBody Integer[] customerId){
        int rows = customerService.deleteBatchCustomer(customerId);
        if(rows!=0){
            return new Result(true,"删除成功");
        }
        return new Result(false,"删除失败");
    }
}
