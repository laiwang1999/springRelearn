package com.yang.aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BookProxy {
    @Before(value = "execution(* com.yang.aopxml.Book.buy(..))")
    public void before(){
        System.out.println("before.........");
    }
}
