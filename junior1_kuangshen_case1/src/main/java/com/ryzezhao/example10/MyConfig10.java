package com.ryzezhao.example10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//这个也会Spring容器拖管，注册到容器中，因为他本来就是一个@Component；而@Configuration代表这是一个配置类，可以类等于之前的example.xml
@Configuration
//第一种方式必须开启扫描，否则报错；第二种方式，不需要开启扫描
@ComponentScan("com.ryzezhao.example10")
public class MyConfig10 {}
