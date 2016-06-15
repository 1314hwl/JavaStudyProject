package com.cn.sz.groovy.model;

public class ModelTest {
	public static void main(String[] args) {
		// 这里实际上是java和groovy的混编
		Mobile m = new Mobile();
		m.setName("android");
		m.setPrice(1000);
		System.out.println(m.toString());
	}

}
