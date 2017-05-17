package com.cn.sz.annotation;

import java.lang.annotation.Annotation;

public class Test1 {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.cn.sz.annotation.Student");
            Annotation annotation[] = clazz.getAnnotations();
            for (Annotation annotation2 : annotation) {
              Class<? extends Annotation> a=   annotation2.annotationType();
              System.out.println(annotation2.toString());
            }
          Table t=  (Table)clazz.getAnnotation(Table.class);
          System.out.println(t.tb_name());  
            

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
