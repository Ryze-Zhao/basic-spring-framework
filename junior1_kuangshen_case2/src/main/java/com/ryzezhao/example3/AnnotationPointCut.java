package com.ryzezhao.example3;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


//注明该类是一个切面
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.ryzezhao.example3.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("========before=========");
    }

    @After("execution(* com.ryzezhao.example3.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("========after=========");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获收处理切入的点：
    @Around("execution(* com.ryzezhao.example3.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("========around:::before=========");
        //执行方法
        Object proceed = proceedingJoinPoint.proceed();
        //获得签名（不是必要的）
        System.out.println("signature:" + proceedingJoinPoint.getSignature());
        System.out.println("proceed:" +proceed);
        System.out.println("========around:::after=========");
    }
}