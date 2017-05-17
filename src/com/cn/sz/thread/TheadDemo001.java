package com.cn.sz.thread;

public class TheadDemo001 {

    public static void main(String[] args) {
        System.out.println("current thread name:" + Thread.currentThread().getName());
        System.out.println("current thread id:" + Thread.currentThread().getId());
        System.out.println("current thread priority:" + Thread.currentThread().getPriority());
        TheadDemo001 mTheadDemo001 = new TheadDemo001();
        MyThread001 myThread001 = mTheadDemo001.new MyThread001();
        myThread001.start();

    }

    private class MyThread001 extends Thread {

        public MyThread001() {
            super();
        }

        @Override
        public void run() {
            super.run();
            int i = 0;
            while (i < 2) {
                i++;
                System.out.println("i:" + i);
                System.out.println("current thread name:" + getName());
                System.out.println("current thread id:" + getId());
                System.out.println("current thread priority:" + getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
