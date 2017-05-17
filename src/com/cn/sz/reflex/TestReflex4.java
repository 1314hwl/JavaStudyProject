package com.cn.sz.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 通过反射机制调用某个类的私有属性
 * 
 * @Description
 * @author HuWeiLiang
 * @date 2017年1月7日 上午11:57:13
 */
public class TestReflex4 {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.cn.sz.reflex.User");
        Constructor<?> cons[] = clazz.getConstructors();
        User obj = (User)cons[0].newInstance(10, "zhangsan");
        // 可以直接对 private 的属性赋值
        Field field = clazz.getDeclaredField("age");
        field.setAccessible(true);
        field.set(obj, 90);
        System.out.println(obj.toString());
    }
}
