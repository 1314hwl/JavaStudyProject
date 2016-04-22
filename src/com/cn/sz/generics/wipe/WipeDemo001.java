package com.cn.sz.generics.wipe;
/**
 * <title>泛型的擦除</title>
 * <p>
 * 在使用,继承，实现，没有指定类型，类似于Object
 * </p>
 * @author HuWeiLiang
 *
 */
public class WipeDemo001 {
	
	public static void main(String[] args) {
		Person p=new Person();//为object类型
		p.setT("name");
		p.setT(123);
	}

}
