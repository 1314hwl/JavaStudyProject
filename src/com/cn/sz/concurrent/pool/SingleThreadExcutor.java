package com.cn.sz.concurrent.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.cn.sz.concurrent.LifeOff;

public class SingleThreadExcutor {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			exec.execute(new LifeOff());
		}
		exec.shutdown();
	}

}
