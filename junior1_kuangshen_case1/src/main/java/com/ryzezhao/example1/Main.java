package com.ryzezhao.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //获取spring的上下文对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("example1.xml");
        //我们的对象现在都在Spring中的管理了，我们要使用，直按去里面收出来就可以！（bossServiceImpl已经在beans.xml配置了）
        BossServiceImpl bossServiceImpl = (BossServiceImpl) context.getBean("bossServiceImpl");
        bossServiceImpl.getSqlDao().select();
    }
}
