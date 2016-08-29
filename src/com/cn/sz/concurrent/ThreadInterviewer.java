package com.cn.sz.concurrent;

/**
 * java用线程的两种实现方式设计四个线程两次对J加1两次对J减1
 * 
 * @Description
 * @author henry
 * @date 2016年8月4日 上午9:03:14
 */
public class ThreadInterviewer {

	public static void main(String[] args) {
		Play p = new Play();
		for (int i = 0; i < 2; i++) {
			AddThread addThread = new AddThread(p);
			addThread.setName("加线程\\" + i);
			addThread.start();
			SubRunnable subRunnable = new SubRunnable(p);
			Thread t = new Thread(subRunnable, "减线程\\" + i);
			t.start();
		}

	}

	static class AddThread extends Thread {
		private Play p;

		public AddThread(Play p) {
			this.p = p;
		}

		@Override
		public void run() {
			super.run();

			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.add();
			}

		}
	}

	static class SubRunnable implements Runnable {
		private Play p;

		public SubRunnable(Play p) {
			this.p = p;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.sub();
			}
		}

	}

}
