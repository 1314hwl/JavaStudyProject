package com.cn.sz.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 通过反射机制调用某个类的方法
 * 
 * @Description
 * @author HuWeiLiang
 * @date 2017年1月7日 上午11:57:13
 */
public class TestReflex3 {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.cn.sz.reflex.User");
        // 调用TestReflect类中的reflect1方法
        // Method method = clazz.getMethod("setId");
        // method.invoke(clazz.newInstance());
        // Java 反射机制 - 调用某个类的方法1.
        // 调用TestReflect的reflect2方法

        Constructor<?> cons[] = clazz.getConstructors();
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
        User user = (User) cons[0].newInstance(10, "zhangsan");
        System.out.println("user:" + user.toString());
        Method method = clazz.getMethod("setName", String.class);
         method.invoke(user, "李四");
         System.out.println("user:" + user.toString());
        // // Java 反射机制 - 调用某个类的方法2.
        // // age -> 20. name -> 张三

    }

}
