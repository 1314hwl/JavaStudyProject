package com.cn.sz.innerclass.topo;

/**
 * <title>局部内部类</title>
 * <p>
 * 1：局部内部类和局部变量一样不能有修饰符(private ,public ,static...) </br>
 * 2.只在局部内可见</br>
 * 3.不能使用普通变量，除非是final 修饰的变量
 * </p>
 * 
 * 
 * @author HuWeiLiang
 *
 */
public class MethodClassDemo001 {

	public void deal() {

		class InnerClass {

			public void test() {
				System.out.println("test java method inner class");
			}

		}

		InnerClass inner = new InnerClass();
		inner.test();

	}

	public static void main(String[] args) {
		MethodClassDemo001 demo = new MethodClassDemo001();
		demo.deal();
	}

}
