package com.ryzezhao.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example4.xml");
       //这里getBean可以使用别名的
        Staff staff = context.getBean("staff",Staff.class);
         System.out.println(staff.toString());
    }
}