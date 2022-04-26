package com.hui.xiaomi.service.impl;

import com.hui.xiaomi.dao.CustomerMapper;
import com.hui.xiaomi.pojo.Customer;
import com.hui.xiaomi.service.CustomerService;
import com.hui.xiaomi.util.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    CustomerMapper customerMapper;
    @Override
    public Customer findCustomer(String username, String password) {
        String md5Pwd = MD5Util.getMD5(password);
        Customer customer = customerMapper.selectCustomer(username, md5Pwd);
        return customer;
    }

    @Override
    public int insertCustomer(Customer customer) {
        List<Customer> customers = customerMapper.selectAllCustomer();
        for (Customer c:customers){
            if (customer.getUserName().equals(c.getUserName())){
                return 0;
            }
        }
        String md5 = MD5Util.getMD5(customer.getPassword());
        customer.setPassword(md5);
        int rows = customerMapper.insertCustomer(customer);
        return rows;

    }

    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> customers = customerMapper.selectAllCustomer();
        return customers;
    }

    @Override
    public int deleteBatchCustomer(Integer[] customerId) {
        int rows = customerMapper.deleteBatchCustomer(customerId);
        return rows;
    }

    @Override
    public int updateCustomerPwd(Customer customer) {
        String md5 = MD5Util.getMD5(customer.getPassword());
        customer.setPassword(md5);
        int rows = customerMapper.updateCustomerPwd(customer);
        return rows;
    }
}
