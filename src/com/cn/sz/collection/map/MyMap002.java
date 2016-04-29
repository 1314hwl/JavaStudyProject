package com.cn.sz.collection.map;

import java.util.LinkedList;

/**
 * <title>自定义实现Map：Map底层由（Array,LinkList实现）</title>
 * <p>
 * 1.map中是以key value的形式存储的<br>
 * 2.map key 不能重复<br>
 * 2.
 * </p>
 * 
 * @author HuWeiLiang
 *
 */
public class MyMap002 {

	private LinkedList mList[] = new LinkedList[999999];// 数组+链表
	private int size;

	public MyMap002() {

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
	 * <p>
	 * 缺点:put 的时候每次都需要循环遍历判断，影响性能<br>
	 * 解决方案思路:数组+链表 <br>
	 * 1.通过hashCode%999取余数来表示index；<br>
	 * 2.如果hashCode%999余数相等,就把MyEntry对象存到链表LinkedList中。<br>
	 * 3.如果LinkedList中存在key相等则替换，如果key不等就加入链表。<br>
	 * 4.查询时通过hashCode%999直接定位到数组中LinkedList对象,循环遍历找到key对应的对象。<br>
	 * </p>
	 * 
	 * @param key
	 * @param value
	 */
	public void put(Object key, Object value) {
		MyEntry entry = new MyEntry();
		entry.setKey(key);
		entry.setValue(value);
		int index = Math.abs(key.hashCode() % 999);
		LinkedList<MyEntry> hasList = mList[index];
		if (hasList != null) {
			for (int i = 0; i < hasList.size(); i++) {
				MyEntry e = hasList.get(i);
				if (e.getKey().equals(key)) {
					e.setValue(value);
					return;
				}
			}
			hasList.add(entry);
			mList[index] = hasList;
			return;
		} else {
			hasList = new LinkedList<MyEntry>();
			hasList.add(entry);
			mList[index] = hasList;
			size++;
		}
	}

	public Object get(Object key) {
		int index = Math.abs(key.hashCode() % 999);
		LinkedList<MyEntry> fList = mList[index];
		if (fList != null) {
			for (int i = 0; i < fList.size(); i++) {
				MyEntry entry = (MyEntry) fList.get(i);
				if (entry.getKey().equals(key)) {
					return entry.getValue();
				}
			}
		}
		return fList;
	}

}
