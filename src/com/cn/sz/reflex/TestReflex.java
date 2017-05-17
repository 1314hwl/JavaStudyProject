package com.cn.sz.reflex;

import java.lang.reflect.Constructor;

public class TestReflex {

    public static void main(String[] args) throws Exception {
        System.out.println("################三种方式获取到类对象######################");
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // 一般采用这种形式
        class1 = Class.forName("com.cn.sz.reflex.TestReflex");
        class2 = new TestReflex().getClass();
        class3 = TestReflex.class;
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());

        System.out.println("################获取父类和实现的接口######################");
        Class<?> clazz = Class.forName("com.cn.sz.reflex.User");
        // 取得父类
        Class<?> parentClass = clazz.getSuperclass();
        System.out.println("clazz的父类为：" + parentClass.getName());
        // clazz的父类为： java.lang.Object
        // 获取所有的接口
        Class<?> intes[] = clazz.getInterfaces();
        System.out.println("clazz实现的接口有：");

        for (int i = 0; i < intes.length; i++) {
            System.out.println((i + 1) + "：" + intes[i].getName());
        }
        // 这里只输出了：BaseHuman 说明获取的是自己继承的接口
        System.out.println("################获取类的全部构造函数######################");
        Class<?> class10  = Class.forName("com.cn.sz.reflex.User");
        // 第一种方法，实例化默认构造方法，调用set赋值
        User user = (User) class10.newInstance();
        user.setId(100);;
        user.setName("Rollen");
        System.out.println(user.toString());
        // 结果 User [age=20, name=Rollen]
        // 第二种方法 取得全部的构造函数 使用构造函数赋值
        Constructor<?> cons[] = class10.getConstructors();
        // 查看每个构造方法需要的参数
        for (int i = 0; i < cons.length; i++) {
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.print("cons[" + i + "] (");
            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1)
                    System.out.print(clazzs[j].getName());
                else
                    System.out.print(clazzs[j].getName() + ",");
            }
            System.out.println(")");
        }
        // 结果
        // cons[0] (java.lang.String)
        // cons[1] (int,java.lang.String)
        // cons[2] ()
        user = (User) cons[0].newInstance(20,"hero");
        System.out.println(user);
        // 结果 User [age=0, name=Rollen]
        user = (User) cons[1].newInstance(20);
        System.out.println(user);
        // 结果 User [age=20, name=Rollen]
    }

}
