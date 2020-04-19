package com.ryzezhao.example11;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //使用Java类作为Config，需要更改实现类，从xml使用的ClassPathXmlApplicationContext，改为AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig11.class);
        //这个取名为getBoss，而不是boss，原因是MyConfig11中写的是getBoss方法
        Boss boss = context.getBean("getBoss", Boss.class);
        System.out.println(boss.toString());
    }
}