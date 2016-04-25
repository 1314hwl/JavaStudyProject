package com.cn.sz.collection.arrayList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * <title>Collection子类ArrayList,LinkList,Vector</title>
 * <p>
 * 1.ArrayList:底层是用数组实现的，线程不安全，效率高。查询快，修改，插入，删除慢,一般都用
 * 2.LinkListL:底层是用链表实现的，线程不安全，效率高。查询慢，修改，插入，删除快。
 * 3.Vector:线程安全的，效率低。
 * </p>
 * @author HuWeiLiang
 *
 */
public class ArrayListDemo001 {
	
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello world");
		list.add(123);
		list.add(new Date());
	    System.out.println(list.size());
	    
	}
	

}
