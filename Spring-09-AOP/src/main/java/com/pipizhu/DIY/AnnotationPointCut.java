package com.pipizhu.DIY;

//使用注解方式实现AOP

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

//标注是一个切面
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.pipizhu.service.*.*(..))")
    public void before(){
        System.out.println("方法执行前注解");
    }
}
