package com.cn.sz.jvm.init;
/**
 * 被动使用类字段演示2
 * 常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义常量的类，因此不会触发定义常量类的初始化
 * @author HuWeiLiang
 *
 */
public class ConstClass {
	
	static{
		System.out.println("init ConstClass...");
	}
	
	public static final int value=103;
	
	


}
