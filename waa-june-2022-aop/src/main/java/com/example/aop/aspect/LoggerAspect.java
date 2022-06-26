package com.example.aop.aspect;

import com.example.aop.repo.ActivityLogRepo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class LoggerAspect {

//    @Autowired
//    private ActivityLogRepo activityLogRepo;

    @Pointcut("@annotation(com.example.aop.aspect.annotation.LogMe)")
    public void a(){
    }

    @After("a()")
    public void log(JoinPoint joinPoint){
        System.out.println("Method Name:" + joinPoint.getSignature().getName());
    }

}
