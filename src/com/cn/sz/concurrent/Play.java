package com.cn.sz.concurrent;

public class Play {
	public int j;

	public synchronized void add() {
		j++;
		System.out.println("thread name:" + Thread.currentThread().getName() + "   j:" + j);
	}

	public synchronized void sub() {
		j--;
		System.out.println("thread name:" + Thread.currentThread().getName() + "   j:" + j);
	}

}
