package com.hui.xiaomi.dao;

import com.hui.xiaomi.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {
    Customer selectCustomer(@Param("userName") String username,@Param("password") String password);
    int insertCustomer(Customer customer);
    List<Customer> selectAllCustomer();
    int deleteBatchCustomer(Integer[] customerId);
    int updateCustomerPwd(Customer customer);
}
