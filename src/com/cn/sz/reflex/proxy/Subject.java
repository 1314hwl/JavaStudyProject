package com.cn.sz.reflex.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface Subject {
    public String say(String name, int age);
}

// 定义真实项目
class RealSubject implements Subject {
    public String say(String name, int age) {
        return name + "  " + age;
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object obj = null;

    public Object bind(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object temp = method.invoke(this.obj, args);
        return temp;
    }
}