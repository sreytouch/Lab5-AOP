package com.example.aop.aspect.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class PostRequestCheckerAspect {

    private HttpServletRequest httpServletRequest;

}
