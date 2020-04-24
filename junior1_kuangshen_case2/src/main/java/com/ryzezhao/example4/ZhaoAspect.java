package com.ryzezhao.example4;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//可以这么理解被切的方法是一个记录，而 @Pointcut是一张表，而所有记录和表存在的地方，就是一个@Aspect切面
@Component
//切面
@Aspect
public class ZhaoAspect {
    //切点(下面这个配置是拦截这个路径下所有类的所有方法)
    @Pointcut(value = "execution(* com.ryzezhao.example4.UserServiceImpl.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("========before=========");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("========after=========");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获收处理切入的点：
    @Around("pointCut()")
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
