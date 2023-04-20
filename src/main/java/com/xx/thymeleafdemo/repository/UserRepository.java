package com.xx.thymeleafdemo.repository;

import com.xx.thymeleafdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

    //根据用户查询用户
    User findByUserName(String username);

    //保存用户信息
    void save(User user);

}
