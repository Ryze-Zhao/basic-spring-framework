package com.ryzezhao.example6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example6.xml");
        Staff staff = context.getBean("staffSingleton", Staff.class);
        Staff staff1 = context.getBean("staffSingleton", Staff.class);
        System.out.println(staff.hashCode());
        System.out.println(staff1.hashCode());

        Staff staff2 = context.getBean("staffPrototype", Staff.class);
        Staff staff3 = context.getBean("staffPrototype", Staff.class);
        System.out.println(staff2.hashCode());
        System.out.println(staff3.hashCode());
    }
}