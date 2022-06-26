package com.example.aop.aspect;

import com.example.aop.repo.ActivityLogRepo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect
@Component
public class ExecutionTImeAspect {
    @Autowired
    private ActivityLogRepo activityLogRepo;
    @Pointcut("@annotation(com.example.aop.aspect.annotation.ExecutionTime)")
    public void executionTimeAnnotation(){
    }


    @Around("executionTimeAnnotation()")
    public Object calculateExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long start = System.nanoTime();
        var result = proceedingJoinPoint.proceed();
        var args = proceedingJoinPoint.getArgs();
        var headerData = (Map<String, String>) args[0];

        long finish = System.nanoTime();
        System.out.println(proceedingJoinPoint.getSignature().getName() + " takes ns: "+ (finish-start));
        return result;
    }

}
