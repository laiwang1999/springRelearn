package com.yang.bean;
//员工类
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public void test(){
        System.out.println(ename+" "+gender+" "+department);
    }
}
