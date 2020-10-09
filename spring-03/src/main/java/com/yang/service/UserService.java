package com.yang.service;

import com.yang.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//在注解里的value属性值可以省略不写
//默认值是类的名称，把首字母小写
@Service(value = "userService") //<bean id="userService" class=""/>
public class UserService {
    @Value(value = "yj")
    private String name;


    //@Resource //根据类型进行注入
    @Resource(name = "userDaoImpl1")//根据名称进行注入
    private UserDao userDao;
    public void add() {
        System.out.println("com.yang.service add.............."+name);
        userDao.add();
    }
}
