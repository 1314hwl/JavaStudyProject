package com.cn.sz.generics.demo;

/**
 * 泛型类
 * 
 * @author HuWeiLiang
 *
 */
public class Student002<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Student002() {
		super();
	}

	public Student002(T t) {
		super();
		this.t = t;
	}
	
	

}
