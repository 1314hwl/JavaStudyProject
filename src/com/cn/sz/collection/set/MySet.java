package com.cn.sz.collection.set;

import java.util.HashMap;

/**
 * <title>Set 集合</title>
 * <p>
 * 1.无序,不可重复 这个和List相反。<br>
 * 2.原理就是参考了HashMap的key不可重复的机制<br>
 * </p>
 * 
 * @author HuWeiLiang
 *
 */
public class MySet {
	private transient HashMap map;

	private static final Object PRESENT = new Object();

	public MySet() {
		map = new HashMap<>();
	}

	public void add(Object obj) {

		map.put(obj, PRESENT);
	}

}
