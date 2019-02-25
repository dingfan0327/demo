package com.yy.dao;

import com.yy.UserdamoApplicationTests;
import com.yy.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserDaoTest extends UserdamoApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    public void queryUser() {
        User admin = userDao.login("admin");
        assertTrue(admin!=null);

    }
    @Test
    public void add(){
        User user = new User();
        user.setPassword("123");
        user.setUsername("aaa");
        int reg = userDao.add(user);
        assertTrue(reg>0);
    }
}