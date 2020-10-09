package com.yang.service;

import com.yang.dao.UserDao;
import com.yang.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userServiceImpl")
@Transactional(timeout = 5,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ) //加在类和方法上均可
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    public void accountMoney() {
        userDao.reduceMoney();
        int i = 1 / 0;
        userDao.addMoney();

    }
}
