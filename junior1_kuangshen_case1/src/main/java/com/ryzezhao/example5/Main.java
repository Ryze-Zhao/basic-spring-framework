package com.ryzezhao.example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example5.xml");
        Staff staff = context.getBean("staff", Staff.class);
        Staff staff1 = context.getBean("staff1", Staff.class);
        System.out.println(staff.toString());
        System.out.println(staff1.toString());
    }
}