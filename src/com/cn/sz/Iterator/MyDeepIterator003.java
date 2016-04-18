package com.cn.sz.Iterator;

import java.util.Iterator;

/**
 * 深入理解迭代器-用匿名内部类实现一个迭代器,生成迭代器时只需重复获取内部类对象即可
 * 
 * @author HuWeiLiang
 *
 */
public class MyDeepIterator003 {

	private String[] elem = { "a", "b", "c" };

	private int size = elem.length;

	public int getSize() {
		return size;
	}

	public Iterator iterator() {
		return new Iterator() {//创建Iterator迭代器接口实现类(匿名)的对象
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
		};
	}

	public static void main(String[] args) {
		MyDeepIterator003 myItorator = new MyDeepIterator003();
		Iterator it = myItorator.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator it1 = myItorator.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println(myItorator.getSize());

	}

}
