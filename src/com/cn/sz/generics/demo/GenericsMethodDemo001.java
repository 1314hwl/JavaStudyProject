package com.cn.sz.generics.demo;

import java.util.List;

public class GenericsMethodDemo001 {

	public static void main(String[] args) {

	}

	public static <T> void dealPay1(List<T> data) {
		// 无返回值的泛型方法
	}

	
	public static <T> List<T> dealPlay2(List<T> data) {
       //有返回值的泛型方法
		return data;
	}

}
