package com.cn.sz.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * <title>泛型的上限 extends</title>
 * <p>
 * 1.一般用于限制操作<br>
 * 2.不能使用在添加数据上面，一般用在读取操作<br>
 * </p>
 * 
 * @author HuWeiLiang
 *
 */
public class UpperLimit {

	public static void main(String[] args) {
		List<? extends Android> mobiles = new ArrayList<Android>();
		test(mobiles);
		List<? extends Mobile> mobiles1 = new ArrayList<Iphone>();
		test(mobiles1);

		// List<?> mobiles2 = new ArrayList<Htc>();
		// test(mobiles2);
	}

	private static void test(List<? extends Mobile> data) {
		//
		// data.add(new Htc());//不能这么操作
		data.add(null);// 只能加null

	}

}
