package com.cn.sz.collection.map;

/**
 * <title>自定义实现Map：Map底层由（Array,LinkList实现）</title>
 * <p>
 * 1.map key 不能重复 2.
 * </p>
 * 
 * @author HuWeiLiang
 *
 */
public class MyMap001 {
	private MyEntry data[] = new MyEntry[1000];
	private int size;

	public MyMap001() {

	}

	public boolean isEmpty() {
		if (size > 0) {
			return false;
		}
		return true;
	}

	public int size() {
		return size;
	}

	/**
	 * 缺点:put 的时候每次都需要循环遍历判断，影响性能
	 * 
	 * @param key
	 * @param value
	 */
	public void put(Object key, Object value) {
		for (int i = 0; i < size; i++) {
			if (data[i].getKey().equals(key)) {
				data[i].setValue(value);
				return;
			}
		}
		MyEntry entry = new MyEntry();
		entry.setKey(key);
		entry.setValue(value);
		data[size++] = entry;
	}

	public Object get(Object key) {
		for (int i = 0; i < size; i++) {
			if (data[i].getKey().equals(key)) {
				return data[i].getValue();
			}
		}
		return null;
	}

	public boolean containsKey(Object key) {
		for (int i = 0; i < size; i++) {
			if (data[i].getKey().equals(key)) {
				return true;
			}
		}
		return false;
	}

	public boolean containsValue(Object value) {
		for (int i = 0; i < size; i++) {
			if (data[i].getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}

	public void remove(Object key) {

	}

	public void clear() {

	}

}
