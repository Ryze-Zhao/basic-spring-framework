package com.ryzezhao.example2;

import com.ryzezhao.example1.BossServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example2.xml");
        System.out.println("---------------------------------");
        Staff staff = (Staff) context.getBean("staff");
         System.out.println(staff.toString());
    }
}
