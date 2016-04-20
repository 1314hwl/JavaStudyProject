package com.cn.sz.innerclass.normal;

/**
 * 普通内部类1：内部类就像一个类的普通成员一样存在于外部类中2.内部类可以随意访问外部类成员变量3.内部类中的this表示的是内部类，外部类用:类名.
 * this 4.不能有静态成员变量
 * 
 * @author HuWeiLiang
 *
 */
public class NormalInnerClassDemo001 {

	private int a = 0;
	private int b = 1;

	private class InnerClassTest {
		private int a = 9;
		private int d = 10;
		// private static int e =100;

		public void test001() {
			System.out.println("a:" + this.a);
			System.out.println("a:" + NormalInnerClassDemo001.this.a);
		}

	}

	public static void main(String[] args) {
		NormalInnerClassDemo001 mNormalInnerClassDemo001 = new NormalInnerClassDemo001();
		mNormalInnerClassDemo001.new InnerClassTest().test001();

	}

}
