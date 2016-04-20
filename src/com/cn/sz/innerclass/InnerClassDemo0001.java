package com.cn.sz.innerclass;

/**
 * 内部类：1：内部类2.静态内部类3.方法内部类
 * 
 * @author HuWeiLiang
 *
 */
public class InnerClassDemo0001 {

	private int a = 1;

	private static int b = 9;

	class Mobile {

		//public static int c = 10;// 内部类中不能有静态成员
		// 内部类

		public void testMobile() {
			System.out.println("test mobile....");
		}
	}

	public static class AndroidMobile {
		// 静态类部类

		public void testAndroidMobile() {

			// System.out.println("a："+a);静态内部类不能访问外部类的非静态成员

			System.out.println("b：" + b);

		}

	}

	void deal() {
		class IphoneClass {
			// 方法内部类
			public void testIphone() {
				System.out.println("iphone mobile");
			}
		}
		new IphoneClass().testIphone();
	}

	public static void main(String[] args) {
		InnerClassDemo0001 demo001 = new InnerClassDemo0001();
		Mobile mobile = demo001.new Mobile();// 访问一个普通内部类
		mobile.testMobile();
		AndroidMobile android = new AndroidMobile();
		android.testAndroidMobile();
		demo001.deal();

	}

}
