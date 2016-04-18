package com.cn.sz.sort.collection;

import java.util.Set;
import java.util.TreeMap;
/**
 * 实现Comparable
 * @author HuWeiLiang
 * 
 */
public class TreeMapDemo002 {
	public static void main(String[] args) {
		Mobile p1 = new Mobile("Android", 30);
		Mobile p2 = new Mobile("Iphone", 40);
		Mobile p3 = new Mobile("Windows Phone", 69);
		Mobile p4 = new Mobile("Nokia", 70);
		TreeMap<Mobile,String>personMap=new TreeMap<Mobile,String>();
		personMap.put(p1, "1");
		personMap.put(p2, "2");
		personMap.put(p3, "3");
		personMap.put(p4, "4");
		Set<Mobile>personKeySets=personMap.keySet();
		System.out.println(personKeySets.toString());
	}

}
