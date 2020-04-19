package com.ryzezhao.example8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example8.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people.toString());
    }
}