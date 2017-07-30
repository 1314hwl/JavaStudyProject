package com.cn.sz.concurrent.practice.safe_2.singleton;
/**
 * @Description 线程安全的单例模式
 * @author HuWeiLiang
 * @date 2017年7月29日 下午2:14:59
 */
public class Singleton001 {
    volatile private static Singleton001 instance = null;

    private Singleton001() {

    }

    public static Singleton001 getInstance() {
        if (instance == null) {
            synchronized (Singleton001.class) {
                if (instance == null)
                    instance = new Singleton001();
            }

        }
        return instance;
    }

}
