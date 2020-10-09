package com.yang.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao {
    //注入JdbcTemplate
    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;


    public void addMoney() {
        String sql = "update mybatis.user_account set money = money + ? where username = ?";
        int update = jdbcTemplate.update(sql, 100, "mary");
        System.out.println(update);
    }

    public void reduceMoney() {
        String sql = "update mybatis.user_account set money = money - ? where username = ?";
        int update = jdbcTemplate.update(sql, 100, "lucy");
        System.out.println(update);
    }
}
