package com.yang.bean;

public class Orders {
    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二部，调用set方法设置属性值");
    }
    public Orders(){
        System.out.println("第一步，无参构造创建bean实例");
    }

    //创建执行的初始化方法
    public void initMethod(){
        System.out.println("第三步，执行初始化的方法");
    }
    //创建销毁的方法
    public void destroyMethod(){
        System.out.println("第五步，执行销毁的方法");
    }
}
