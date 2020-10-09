package com.yang.aopxml;

import org.springframework.stereotype.Component;

@Component
public class Book {
    public void buy(){
        System.out.println("buy .........");
    }
}
