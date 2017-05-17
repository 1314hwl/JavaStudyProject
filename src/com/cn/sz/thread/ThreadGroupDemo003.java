package com.cn.sz.thread;

public class ThreadGroupDemo003 {

    public static void main(String[] args) {
        final ThreadGroup tg = new ThreadGroup("myThreadGroup");
        ThreadGroupDemo003 mDemo003 = new ThreadGroupDemo003();
        MyThread thread = mDemo003.new MyThread(tg, new Runnable() {

            @Override
            public void run() {
                System.out.println("threadGroup name:" + tg.getName());
                System.out.println("threadGroup active Count:" + tg.activeCount());
                try {
                    System.out.println("runnable run.....");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    // e.printStackTrace();
                    System.out.println(e.toString());
                }
                System.out.println("thread over.....");

            }

        }, "helloWorld", 0);

        System.out.println("threadGroup active Count:" + tg.activeCount());
        System.out.println("thread name:" + thread.getName());
        thread.start();
        thread.interrupt();
        if (thread.isInterrupted()) {
            System.out.println("线程已经中断...");
        }
    }

    class MyThread extends Thread {

        public MyThread(ThreadGroup group, Runnable r, String name, int stackSize) {
            super(group, r, name, stackSize);
        }

    }

}
