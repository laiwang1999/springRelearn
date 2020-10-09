package com.yang;

public class Book {
    private String bname;
    private String author;

    //set方法注入
    public void setBname(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

    public Book() {

    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //有参构造注入
    public Book(String bname) {
        this.bname = bname;
    }
    public void testDemo(){
        System.out.println(bname+"::"+author);
    }
}
