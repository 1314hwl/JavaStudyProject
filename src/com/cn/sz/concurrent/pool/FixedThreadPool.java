package com.cn.sz.concurrent.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.cn.sz.concurrent.LifeOff;

public class FixedThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(3);
		// 线程池最大并发3个线程
		for (int i = 0; i < 5; i++) {
			// 先执行0,1,2 然后3,4
			exec.execute(new LifeOff());
		}
		exec.shutdown();
	}

}
