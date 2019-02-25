package com.yy.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yy.UserdamoApplicationTests;
import com.yy.entity.Customer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class CustomerDaoTest extends UserdamoApplicationTests {
    @Autowired
    private CustomerDao customerDao;
    @Test
    public void queryCustomerList(){
        PageHelper.startPage(1,2);
        List<Customer> customerList = customerDao.queryCustomerList();
        for (Customer customer:customerList) {
            System.out.println(customer.getC_name());
        }
        PageInfo<Customer> pageInfo = new PageInfo<>(customerList);
        System.out.println("共有"+pageInfo.getTotal());
        System.out.println("上一页"+pageInfo.getPrePage());
        System.out.println("上一页"+pageInfo.getNavigateLastPage());
        System.out.println("qq"+pageInfo.getPages());
    }
    @Test
    public void add(){
        Customer customer = new Customer();
        customer.setC_address("asd");
        customer.setC_name("asdasdad");
        customer.setC_telephone("213131");
        customer.setC_remark("asdsadad");
        int i = customerDao.addCustomer(customer);
        assertTrue(i>0);
    }
    @Test
    public void sel(){
        List<Customer> bbb = customerDao.queryCustomer("bbb");
        System.out.println(bbb.size());
    }

    @Test
    public void selId(){
        Customer customer = customerDao.queryById(1);
        System.out.println(customer.getC_name());
    }
    @Test
    public void upd(){
            Customer c=new Customer();
            c.setC_id(6);
            c.setC_name("刺刀");
//            c.setC_remark("adadaad");
//            c.setC_telephone("432342424");
//            c.setC_address("asdsadadadada");
        int b=customerDao.updateCustomer(c);
        assertTrue(b>0);
    }
}