package com.gupaoedu.vip.pattern.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class Agent implements InvocationHandler {

    private Object target;
    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
       return obj;
    }

    private void before(){
        System.out.println("找房子");
        System.out.println("开始找房子");
    }

    private void after(){
        System.out.println("OK的话，准备开始找");
    }
}

