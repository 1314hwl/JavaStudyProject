package com.cn.sz.sort.comparable;

import java.util.Comparator;

/**
 * 按长度比较大小 正数：>1 负数:<1
 * 
 * @author HuWeiLiang
 *
 */
public class StringComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		return -(len1 - len2);
	}

}
