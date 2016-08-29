package com.cn.sz.concurrent.sleep;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.cn.sz.concurrent.LifeOff;

import groovy.ui.SystemOutputInterceptor;

public class SleepingTask extends LifeOff {

	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.println(getStatus());
			try {
				TimeUnit.SECONDS.sleep(2);// 线程休眠1.5以后
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("interrupted...");
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("&&&" + TimeUnit.HOURS.toHours(2));
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 3; i++) {
			exec.execute(new SleepingTask());
		}
		exec.shutdown();
	}

}
