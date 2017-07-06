package com.cn.sz.reflex.proxy.factory;
/**
 * 将反射机制应用于工厂模式
 * @Description 
 * @author HuWeiLiang
 * @date 2017年1月8日 上午8:43:41
 */
public class FruitTest {
    public static void main(String[] args) throws Exception {
        String className="com.cn.sz.reflex.proxy.factory.Orange";
        System.out.println("className:"+className);
        className=Orange.class.getName();
        System.out.println("className1:"+className);
        fruit f = Factory.getInstance(className);
        if (f != null) {
            f.eat();
        }
    }
}
