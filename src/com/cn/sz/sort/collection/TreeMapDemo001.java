package com.cn.sz.sort.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap和HashMap用法类似，但是要求键可以排序
 * 
 * @author HuWeiLiang
 *
 */
public class TreeMapDemo001 {
	public static void main(String[] args) {
		Person p1 = new Person("张学友", 30);
		Person p2 = new Person("刘德华", 40);
		Person p3 = new Person("张曼玉", 69);
		Person p4 = new Person("成龙", 70);
		TreeMap<Person,String>personMap=new TreeMap<Person,String>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getAge()-o2.getAge();
			}
		});
		personMap.put(p1, "1");
		personMap.put(p2, "2");
		personMap.put(p3, "3");
		personMap.put(p4, "4");
		
		Set<Person>personKeySets=personMap.keySet();
		System.out.println(personKeySets.toString());

	}

}
