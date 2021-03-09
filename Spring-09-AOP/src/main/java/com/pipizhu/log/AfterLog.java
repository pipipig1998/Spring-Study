package com.pipizhu.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

//    返回值，执行方法，参数，对象
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了" + method.getName() + "返回了" + o);
    }
}
