package com.cn.sz.thread.pool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo002 {

    class Task implements Runnable {
        private Date initDate;

        private String name;

        public Task(String name) {
            initDate = new Date();
            this.name = name;
        }

        @Override
        public void run() {
            System.out.printf("%s: Task %s: Created on: %s\n", Thread.currentThread().getName(), name, initDate);
            System.out.printf("%s: Task %s: Started on: %s\n", Thread.currentThread().getName(), name, new Date());
            try {
                Long duration = (long) (Math.random() * 10);
                System.out.printf("%s: Task %s: Doing a task during %dseconds\n", Thread.currentThread().getName(),
                        name, duration);
                TimeUnit.SECONDS.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s: Task %s: Finished on: %s\n", Thread.currentThread().getName(), name, new Date());
        }

    }

    class Server {
        private ThreadPoolExecutor executor;

        public Server() {
            executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        }

        public void executeTask(Task task) {
            System.out.printf("Server: A new task has arrived\n");
            executor.execute(task);
            System.out.printf("Server: Pool Size: %d\n", executor.getPoolSize());
            System.out.printf("Server: Active Count: %d\n", executor.getActiveCount());
            System.out.printf("Server: Completed Tasks: %d\n", executor.getCompletedTaskCount());

        }

        public void endServer() {
            executor.shutdown();
        }
    }

    public static void main(String[] args) {
        ThreadPoolDemo002 mThreadPoolDemo002 = new ThreadPoolDemo002();
        Server server = mThreadPoolDemo002.new Server();
        for (int i = 0; i < 5; i++) {
            Task task = mThreadPoolDemo002.new Task("Task " + i);
            server.executeTask(task);
        }
        server.endServer();
    }

}
