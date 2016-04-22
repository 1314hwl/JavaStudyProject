package com.cn.sz.generics.demo;

/**
 * <title>自定义泛型类</title>
 * <p>
 * 1.<>中放单个的大写字母，尽可能见名知意</br>
 * 2.T-type，K-key,V-value,E-Element</br>
 * 3.泛型不能使用在静态属性上，指定的类型不能是基本数据类型</br>
 * </p>
 * 
 * @author HuWeiLiang
 *
 */
public class GenericsDemo002 {

	public static void main(String[] args) {
		Student001 mStudent1 = new Student001(1);
		if (mStudent1.getObj() instanceof String) {// 这里Object需要做类型判断
			System.out.println((String) mStudent1.getObj());
		} else if (mStudent1.getObj() instanceof Integer) {// 这里Object需要做类型判断
			System.out.println("value:" + (Integer) mStudent1.getObj());
		}

		Student002<Integer> mStudent002 = new Student002<>();
		mStudent002.setT(100);
		System.out.println("" + mStudent002.getT());// 类型已经指定使用时不需要类型判断

	}

}
