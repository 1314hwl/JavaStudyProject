package com.cn.sz.concurrent;

public class ThreadDemo001 {
	public static int index = 0;

	public static void main(String[] args) {
		MyThread thread = new ThreadDemo001().new MyThread();
		thread.start();
	}

	class MyThread extends Thread {
		@Override
		public void run() {
			super.run();
			if (index < 100) {
				index++;
			}
		}
	}

}
