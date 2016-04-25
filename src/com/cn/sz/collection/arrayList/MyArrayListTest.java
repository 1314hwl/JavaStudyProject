package com.cn.sz.collection.arrayList;

public class MyArrayListTest {
	
	public static void main(String[] args) {
		MyArrayList001 list=new MyArrayList001(3);
		list.add("123");
		list.add(123);
		list.add("helloWorld");
		list.add("bad");
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
//		list.remove("123");
		list.add(3, "test insert...");
		System.out.println("==========================");
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		
	}

}
