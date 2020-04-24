package com.ryzezhao.example2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.save();
    }
}