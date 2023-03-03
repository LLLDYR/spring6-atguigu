package com.example.spring6;

public class User  {

    public User(){
        System.out.println("无参数构造方法执行");
    }
    public void add(){
        System.out.println("add......");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
