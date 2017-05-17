package com.cn.sz.thread;

/**
 * 设计 4个线程，其中两个线程每次对 j 增加 1，另外两个线程对 j 每次减少 1。写出程序
 * 
 * @Description
 * @author HuWeiLiang
 * @date 2017年1月10日 下午3:35:42
 */
public class ThreadDemo002 {

    int i = 0;

    public static void main(String[] args) {

        ThreadDemo002 threadDemo002 = new ThreadDemo002();
        for (int i = 0; i < 2; i++) {
            Thread1 thread1 = threadDemo002.new Thread1();
            thread1.start();
            Thread thread2 = new Thread(threadDemo002.new Thread2());
            thread2.start();
        }
    }

    class Thread1 extends Thread {
        @Override
        public synchronized void run() {
            super.run();
            while (true) {
                i++;
                System.out.println("i:" + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    class Thread2 implements Runnable {

        @Override
        public synchronized void run() {
            while (true) {
                i--;
                System.out.println("i:" + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }

}
