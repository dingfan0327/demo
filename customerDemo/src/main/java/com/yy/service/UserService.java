package com.yy.service;

import com.yy.entity.User;

public interface UserService {

    User login(String username);
    int add(User user);
}
