package com.cn.sz.concurrent;

public class LifeOff implements Runnable {

	public int countDown = 10;

	private static int taskCount = 0;

	private final int id = taskCount++;

	public String getStatus() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "liftoff!") + ")";
	}

	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.println(getStatus());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread.yield();
		}
	}

}
