package com.yy.service.impl;

import com.yy.dao.UserDao;
import com.yy.entity.User;
import com.yy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(String username) {

        return userDao.login(username);
    }

    @Override
    public int add(User user) {

        return userDao.add(user);
    }
}
