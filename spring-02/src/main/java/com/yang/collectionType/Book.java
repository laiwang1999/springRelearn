package com.yang.collectionType;

import java.util.List;

public class Book {
    public List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }
    public void test(){
        System.out.println(list);
    }
}
