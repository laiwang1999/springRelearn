package com.yang;
/*
有参构造进行注入
 */
public class Orders {
    private String name;
    private String address;

    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void test(){
        System.out.println(name+" "+address);
    }
}
