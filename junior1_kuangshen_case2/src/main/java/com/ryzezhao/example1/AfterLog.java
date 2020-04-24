package com.ryzezhao.example1;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    /*
     * returnValue:返回值
     * method：要执行的目标对象的方法
     * args：参数
     * target：目标对象
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("========before=========" + target.getClass().getName() + "的方法" + method.getName() + "已执行完毕，返回结果为"+returnValue);
    }
}