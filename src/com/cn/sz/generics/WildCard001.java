package com.cn.sz.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 1.?通配符，类型不确定，用于声明变量|形参上</br>
 * 2.不能用在1>创建对象2>创建泛型类，泛型方法，泛型接口
 * </p>
 * 
 * @author HuWeiLiang
 *
 */
public class WildCard001 {
	public static void main(String[] args) {
		List<?> data = new ArrayList<String>();

	}

	// 不能用在泛型方法上
	// private <?>void testPlay(List<?>data){
	//
	// }

	// 不能用在泛型类上
	// private class WildCardTest<?>{
	//
	// }

	// 不能用在泛型接口上
	// interface callBack<?>{
	//
	// }

}
