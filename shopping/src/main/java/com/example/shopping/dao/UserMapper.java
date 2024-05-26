package com.example.shopping.dao;

import com.example.shopping.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository//spring框架的持久层（dao）标识
public interface UserMapper {
    int login(User user);
    int register(User user);
    int countByUserName(String name);
}
