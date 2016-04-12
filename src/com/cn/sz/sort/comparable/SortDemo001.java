package com.cn.sz.sort.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortDemo001 {

	public static void main(String[] args) {
		String arrayStr[]={"abc","a","def"};
		//BubbingSort01(arrayStr);
		CompareUtils.sort(arrayStr);
		System.out.println("----------int数组排序--------------");
	    Integer intArray[]={9,8,7,3,4,5};
		CompareUtils.sort(intArray);
		System.out.println("==================list排序=================");
		List<String>mListData=new ArrayList<String>();
		mListData.add("a");
		mListData.add("abc");
		mListData.add("fed");
		CompareUtils.sort(mListData);
		System.out.println(mListData.toString());
	}
	

}
