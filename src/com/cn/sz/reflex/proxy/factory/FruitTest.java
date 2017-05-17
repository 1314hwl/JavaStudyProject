package com.cn.sz.reflex.proxy.factory;
/**
 * 将反射机制应用于工厂模式
 * @Description 
 * @author HuWeiLiang
 * @date 2017年1月8日 上午8:43:41
 */
public class FruitTest {
    public static void main(String[] args) throws Exception {
        fruit f = Factory.getInstance("com.cn.sz.reflex.proxy.factory.Orange");
        if (f != null) {
            f.eat();
        }
    }
}
