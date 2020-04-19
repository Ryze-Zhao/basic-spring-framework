package com.ryzezhao.example9;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example9.xml");
        Staff staff = context.getBean("staff", Staff.class);
        System.out.println(staff.toString());
    }
}