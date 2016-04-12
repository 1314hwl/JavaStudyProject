package com.cn.sz.sort.comparable;

public class JavaBaseType {
	
	public static void main(String[] args) {
		Integer a;//根据基本数据类型大小float double long
		Character c;//A-65 B-66 根据Unicode编码顺序
		String s;//1.如果
		String str1="abc";
		String str2="abce";
		System.out.println(str1.compareTo(str2));//如果其中一个是另外一个的子串,比较的是长度之差 :3-4=-1
		String str3="abc";
		String str4="abg";
		System.out.println(str3.compareTo(str4));//如果不是子串,返回第一个不相同字母的unicode之差：c-g=-4
		
	}

}
