package com.cn.sz.generics.demo;

/**
 * <title>泛型接口</title>
 * <p>
 * 1.不能有泛型的常量</br>
 * 2.可以有泛型的方法
 * </p>
 * 
 * @author HuWeiLiang
 *
 * @param <T>
 */
public interface GenericsInterface<T extends String, V extends Integer> {

	// T a;//不能有泛型的变量
	final int a = 9;

	<T> void dealPlay(T t);// 可以有泛型方法

	V dealPlay1(V v);// 有返回值的泛型方法
}
