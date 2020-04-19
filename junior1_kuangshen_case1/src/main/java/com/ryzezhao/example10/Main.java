package com.ryzezhao.example10;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //使用Java类作为Config，需要更改实现类，从xml使用的ClassPathXmlApplicationContext，改为AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig10.class);
        Staff staff = context.getBean("staff", Staff.class);
        System.out.println(staff.toString());
    }
}