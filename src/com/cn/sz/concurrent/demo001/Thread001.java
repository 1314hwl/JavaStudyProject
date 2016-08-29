package com.cn.sz.concurrent.demo001;

import com.cn.sz.concurrent.LifeOff;

public class Thread001 {
	public static void main(String[] args) {
		LifeOff t2 = new LifeOff();
		t2.run();
		//
		// Thread t1 = new Thread(new LifeOff());
		// t1.start();

		// for (int i = 0; i < 3; i++) {
		// new Thread(new LifeOff()).start();
		// }

	}

}
