package com.cn.sz.concurrent.practice.share_3;

/**
 * 
 * @Description 3.1.4 volatile<br>
 * 1.volatile是比synchronized更轻量级的同步机制。synchronized可以确保正确性和可见性，而volatile只能保证可见性<br>
 * 当且仅当满足以下条件时，才应该使用volatile变量：<br>
 * 1.对变量的写入操作不依赖变量的当前值，或者你能确保只有单个线程更新变量的值。<br>
 * 2.该变量不会与其他变量一起纳入不变性条件中。<br>
 * 3.在访问变量时不需要加锁<br>
 * 4.volatile的语义不足以确保递增操作count++的原子性。
 * @author HuWeiLiang
 * @date 2017年7月30日 下午4:12:42
 */
public class Volatile3_1_4 {

    public static volatile boolean asleep;

    public static void main(String[] args) {
        while (asleep) {
            countSomeSheep();
        }

    }

    private static void countSomeSheep() {
        // TODO Auto-generated method stub

    }

}
