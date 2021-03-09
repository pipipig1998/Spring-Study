package com.pipizhu.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyLog implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("执行了" + method.getName() + ",参数是" + objects.toString() + "对象是" + o.getClass().getName());
    }
}
