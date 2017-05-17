package com.cn.sz.jvm.init;
/**
 * 被动使用类字段演示一
 * 通过类引用父类的静态字段，不会导致子类初始化
 * @author HuWeiLiang
 *
 */
public class SuperClass {
	static{
		System.out.println("SuperClass init...");
	}
	
	public static int value=130;

}

class SubClass extends SuperClass{
	static{
		System.out.println("SubClass init...");
	}
}
