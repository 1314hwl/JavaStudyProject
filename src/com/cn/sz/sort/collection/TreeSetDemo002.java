package com.cn.sz.sort.collection;

import java.util.TreeSet;

public class TreeSetDemo002 {
	public static void main(String[] args) {
		Person p1=new Person("张学友",30);
		Person p2=new Person("刘德华",40);
	    Person p3=new Person("张曼玉",69);
	    Person p4=new Person("成龙",70);
	    //匿名内部类
	    TreeSet<Person>mPersons=new TreeSet<Person>();
	    mPersons.add(p1);
	    mPersons.add(p2);
	    mPersons.add(p3);
	    mPersons.add(p4);
	    System.out.println(mPersons);
	}

}
