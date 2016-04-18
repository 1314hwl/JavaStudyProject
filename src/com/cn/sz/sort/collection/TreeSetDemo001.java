package com.cn.sz.sort.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 排序容器:TreeSet 与 TreeMap
 * 1.TreeSet：数据可以排序且不可重复，Set接口的实现类，（HashSet元素必须重写hashCode和equals方法，TreeSet不需要重写）
 * 2.TreeSet去重:=0即是重复 3.元素可以排序java.lang.compareable+compareTo,new TreeSet()
 * 3.业务类java.lang.Comparator+compare+new TreeSet(new Comparator())
 * @author HuWeiLiang
 *
 */
public class TreeSetDemo001 {

	public static void main(String[] args) {
		Person p1=new Person("张学友",30);
		Person p2=new Person("刘德华",40);
	    Person p3=new Person("张曼玉",69);
	    Person p4=new Person("成龙",70);
	    //匿名内部类
	    TreeSet<Person>mPersons=new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return -(p1.getAge()-p2.getAge());//这里通过age比较，age=0的时候表示重复
			}
		});
	    mPersons.add(p1);
	    mPersons.add(p2);
	    mPersons.add(p3);
	    mPersons.add(p4);
	    System.out.println(mPersons);
	    
	}

}
