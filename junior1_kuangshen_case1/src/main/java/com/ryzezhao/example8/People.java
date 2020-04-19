package com.ryzezhao.example8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    //    @Autowired
//    @Qualifier(value = "peopleName")
//    private String name;
//    @Autowired
//    @Qualifier(value = "dog")
//    private Dog dog;
//    @Autowired
//    @Qualifier(value = "cat")
//    private Cat cat;

    // 使用Java的@Resource注解
    @Resource(name = "peopleName")
    private String name;
    @Resource(name = "dog")
    private Dog dog;
    @Resource(name = "cat")
    private Cat cat;
}
