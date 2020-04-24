package com.ryzezhao.example1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.save();
    }
}








