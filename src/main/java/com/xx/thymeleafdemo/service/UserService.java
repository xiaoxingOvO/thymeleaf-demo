package com.xx.thymeleafdemo.service;


import com.xx.thymeleafdemo.entity.User;

public interface UserService {

    //注册用户
    void register(User user);

    //用户登录
    User login(String username, String password);
}
