package com.cn.sz.Iterator;

import java.util.Iterator;

/**
 * 深入理解迭代器-用类不类实现一个迭代器,生成迭代器时只需重复获取内部类对象即可
 * 
 * @author HuWeiLiang
 *
 */
public class MyDeepIterator002 {

	private String[] elem = { "a", "b", "c" };

	private int size = elem.length;

	public int getSize() {
		return size;
	}

	public Iterator getIterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator {
		private int cursor = -1;

		public boolean hasNext() {
			if (cursor + 1 < size) {
				return true;
			}
			return false;
		}

		public String next() {
			return elem[++cursor];
		}

		public void remove() {
			// 移动数组的元素
			System.arraycopy(elem, cursor + 1, elem, cursor, size - (cursor + 1));
			size--;
			cursor--;

		}
	}

	public static void main(String[] args) {
		MyDeepIterator002 myItorator = new MyDeepIterator002();
		Iterator it = myItorator.getIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator it1 = myItorator.getIterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
