package com.hui.xiaomi.controller;

import com.hui.xiaomi.pojo.Customer;
import com.hui.xiaomi.service.CustomerService;
import com.hui.xiaomi.util.JWTUtils;
import com.hui.xiaomi.vo.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/action")
public class CustomerController {
    @Resource
    CustomerService customerService;
    @RequestMapping("/loginin")
    public Result selectCustomer(String username, String password, HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException {
        Customer customer = customerService.findCustomer(username, password);
        if (customer!=null){
            String token = JWTUtils.createJWT(customer.getCustomerId());
            response.setHeader("token",token);
            return new Result(true,"登录成功","token:"+token);
        }
        return new Result(false,"登录失败");
    }
    @RequestMapping("/register")
    public Result insertCustomer(@RequestBody Customer customer){
        int rows = customerService.insertCustomer(customer);
        if (rows!=0){
            return new Result(true,"注册成功");
        }
        return new Result(true,"注册失败,用户名已存在");
    }
    @RequestMapping("/updateCustomerPwd")
    public Result updateCustomerPwd(@RequestBody Customer customer){
        int rows = customerService.updateCustomerPwd(customer);
        if (rows!=0){
            return new Result(true,"密码更改成功");
        }
        return new Result(true,"密码更改失败");
    }
}
