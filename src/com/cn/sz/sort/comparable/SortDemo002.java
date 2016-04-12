package com.cn.sz.sort.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo002 {
	
	public static void main(String[] args) {
		
		System.out.println("===============自定义Comparator比较器==================");
		String[]array={"abc","a","edff","esesdfas"};
		CompareUtils.sort(array, new StringComp());
		System.out.println(Arrays.toString(array));
		System.out.println("===============系统Collections比较器==================");
		List<String>listData=new ArrayList<>();
		listData.add("345");
		listData.add("1");
		listData.add("453543");
		listData.add("453");
		Collections.sort(listData);//按引用类型排序
		System.out.println(listData.toString());
		System.out.println("==================================================");
		Collections.sort(listData, new StringComp());//自定义的比较器
		System.out.println(listData.toString());
		
		
	}

}
