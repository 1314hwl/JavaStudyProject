package com.cn.sz.innerclass.staticInner;

/**
 * 静态内部类
 * 
 * @author HuWeiLiang
 *
 */
public class StaticInnerClassDemo001 {

	private int a = 0;
	private static int b = 1;

	public static class TestClass {
		public void play() {
			// System.out.println("----a"+a);//不能访问外部类的非静态成员
			System.out.println("----b=" + b);
		}
	}

	public static void main(String[] args) {

		TestClass t = new TestClass();// 直接生成静态内部类的对象
		t.play();
		StaticInnerClassDemo001.TestClass t2 = new StaticInnerClassDemo001.TestClass();// 通过外部类生成静态内部类对象
		t2.play();
	}

}
