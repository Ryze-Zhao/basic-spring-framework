package com.ryzezhao.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example3.xml");
        Boss boss = context.getBean("boss",Boss.class);
         System.out.println(boss.toString());
    }
}
