package com.yy.dao;

import com.yy.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User login(String username);
    int add(User user);
}
