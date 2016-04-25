package com.cn.sz.collection.arrayList;

/**
 * 自定义实现一个ArrayList,实现其size(),get(int index),add(Object obj)，remove(),add(int index,Object)方法，加深对ArrayList的理解
 * 
 * @author HuWeiLiang
 *
 */
public class MyArrayList001 {
	private Object[] elements;
	private int size;

	public MyArrayList001() {
		this(10);

	}

	public MyArrayList001(int initialCapacity) {
		if (initialCapacity < 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		this.elements = new Object[initialCapacity];
	}

	/**
	 * add method
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		ensureCapacity();
		elements[size++] = obj;
	}

	/**
	 * 数组的扩容Ï
	 */
	public void ensureCapacity() {
		if (size == elements.length) {// 数组的扩容
			Object[] newArray = new Object[size * 2 + 1];
			System.arraycopy(elements, 0, newArray, 0, elements.length);// 把老的数据拷贝到新的数组中
			elements = newArray;
		}
	}

	/**
	 * add object on index
	 * 
	 * @param index
	 * @param obj
	 */
	public void add(int index, Object obj) {
		rangeCheck(index);
		ensureCapacity();
		System.arraycopy(elements, index, elements, index + 1, elements.length - (index + 1));// 把老的数据拷贝到新的数组中
		elements[index] = obj;
		size++;

	}

	/**
	 * get method
	 * 
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return elements[index];
	}

	/**
	 * isEmpty method
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	/**
	 * remove method
	 */
	public void remove(int index) {
		rangeCheck(index);
		// 1,2,3,4,5
		int moveNum = elements.length - (index + 1);// copy.length=element.length-(index+1)，age:如果移除3，3的下标是2，剩余4，5
		System.arraycopy(elements, index, elements, index + 1, moveNum);
		elements[--size] = null;

	}

	/**
	 * remove one object
	 * 
	 * @param obj
	 */
	public void remove(Object obj) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(obj)) {
				remove(i);
				return;
			}
		}
	}

	/**
	 * 范围检测
	 * 
	 * @param index
	 */
	private void rangeCheck(int index) {
		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * size method
	 * 
	 * @return
	 */
	public int size() {
		return this.size;
	}

}
