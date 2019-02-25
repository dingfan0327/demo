package com.yy.service;

import com.yy.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomerList();
    List<Customer> getCustomer(String name);
    int del(int cid);
    int add(Customer customer);
    int updCustomer(Customer customer);
    Customer queryById(Integer c_id);

}
