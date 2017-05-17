package com.cn.sz.reflex.proxy;
/**
 * 代理
 * @Description 
 * @author HuWeiLiang
 * @date 2017年1月8日 上午8:43:54
 */
public class TestProxy {
    public static void main(String[] args) throws Exception {
        MyInvocationHandler demo = new MyInvocationHandler();
        Subject sub = (Subject) demo.bind(new RealSubject());
        String info = sub.say("Rollen", 20);
        System.out.println(info);
    }
}
