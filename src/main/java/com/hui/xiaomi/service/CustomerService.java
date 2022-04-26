package com.hui.xiaomi.service;

import com.hui.xiaomi.pojo.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomer(String username,String password);
    int insertCustomer(Customer customer);
    List<Customer> selectAllCustomer();
    int deleteBatchCustomer(Integer[] customerId);
    int updateCustomerPwd(Customer customer);
}
