package com.ryzezhao.example2;


/**
 * 多个切点
 */
public class CustomizePointCut{
    public void before(){
        System.out.println("========before=========");
    }
    public void after(){
        System.out.println("========after=========");
    }
}