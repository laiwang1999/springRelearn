package com.yang.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component//对象创建
@Aspect//代理对象创建
@Order(1)
public class PersonProxy {
    @Before(value = "execution(* com.yang.aopanno.User.add(..))")
    public void before(){
        System.out.println("Person before......");
    }
}
