package com.ryzezhao.example11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//这个也会Spring容器拖管，注册到容器中，因为他本来就是一个@Component；而@Configuration代表这是一个配置类，可以类等于之前的example.xml
@Configuration
//第一种方式必须开启扫描，否则报错；第二种方式，不需要开启扫描
@ComponentScan("com.ryzezhao.example11")
public class MyConfig11 {
    /*
    注册一个bean，就相当于我们之前写的一个他ean标签
    这个方法的名字getBoss，就相当于bean标签中的id属性
    这个方法的返回值Boss，就相当于bean标签中的class属性
    */
    @Bean
    public Boss getBoss(){
        //就是返回要注入的Bean对象
        return new Boss("老板",24);
    }
}
