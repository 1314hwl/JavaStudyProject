package com.cn.sz.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * <title>泛型的下限 super</title>
 * <p>
 * 1.？super T：意思是?必须是T的父类或者是T，>=T<br>
 * </p>
 * 
 * @author HuWeiLiang
 *
 */
public class LowerLimit {

	private static void test(List<? super Android> data) {
		data.add(new Htc());
		data.add(new Mimi());
		data.add(new Mimi2());
		data.add(new Android());
	}

	public static void main(String[] args) {
		List<Android> androidData = new ArrayList<Android>();
		test(androidData);
		List<Mobile> mobileData = new ArrayList<Mobile>();
		test(mobileData);
		List<Object> testData = new ArrayList<Object>();
		test(testData);
//		 List<Htc>htcData=new ArrayList<Htc>();
//		 test(htcData);

		List<? super Android> androids = new ArrayList<Mobile>();
		androids.add(new Htc());
		test(androids);
		List<?> androids1 = new ArrayList<>();
		// test(androids1);//这里不能使用,是因为? == ? extends Object ,
	}

}
