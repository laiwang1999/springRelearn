package com.yang.service;

import com.yang.dao.UserDao;
import com.yang.dao.UserDaoImpl;

public class UserService {
    //创建UserDao类型属性，生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void add(){
        System.out.println("com.yang.service add ...");
        //创建UserDao对象
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();
        userDao.update();
    }

}
