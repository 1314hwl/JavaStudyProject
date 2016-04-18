package com.cn.sz.Iterator;

/**
 * 理解迭代器
 * 
 * @author HuWeiLiang
 *
 */
public class MySimpleIterator001 {

	private String[] elem = { "a", "b", "c" };

	private int size = elem.length;

	private int cursor = -1;

	public int getSize() {
		return size;
	}

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

	public static void main(String[] args) {
		MySimpleIterator001 myItorator = new MySimpleIterator001();
		// if (myItorator.hasNext()) {
		// System.out.println(myItorator.next());
		// }
		// if (myItorator.hasNext()) {
		// System.out.println(myItorator.next());
		// }
		// if (myItorator.hasNext()) {
		// System.out.println(myItorator.next());
		// }
		// if (myItorator.hasNext()) {
		// System.out.println(myItorator.next());
		// }

		while (myItorator.hasNext()) {
			System.out.println(myItorator.next());
			myItorator.remove();
		}

		// System.out.println(myItorator.getSize());

		MySimpleIterator001 myIterator1 = new MySimpleIterator001();
		while (myIterator1.hasNext()) {
			System.out.println(myIterator1.next());
		}

		//思考: 每生成一个迭代器需要重新创建一个实体对象MySimpleIterator001-->优化在不创建MySimpleIterator001对象时获取迭代器对象--->MyDeepIterator002

	}

}
