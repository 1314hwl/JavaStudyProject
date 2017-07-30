package com.cn.sz.concurrent.practice.safe_2;
/**
 * 
 * @Description 2.2.2延迟初始化中的竞态条件<br>
 * 1.当两个线程同时访问getInstance()方法时，存在竞态条件，不是线程安全的。
 * @author HuWeiLiang
 * @date 2017年7月29日 下午1:40:07
 */
public class LazyInitRace2_2_1 {
    private Object instance = null;

    public Object getInstance() {
        if (instance == null) {
            instance = new Object();
        }
        return instance;
    }

}
