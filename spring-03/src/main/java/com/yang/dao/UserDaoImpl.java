package com.yang.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    public void add() {
        System.out.println("com.yang.dao add....");
    }
}
