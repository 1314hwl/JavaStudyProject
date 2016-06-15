package com.cn.sz.groovy.collection

import com.cn.sz.groovy.model.Mobile

class ArrayDemo001 {

	void arrayTest1(){
		int[] a = [1, 2, 3]//定义一个int型的数组,和java的区别int[]a={}
		int size=a.size();
		for(i in 0..size-1){//遍历int数组,和Java的区别:for(int i=0;i<size;i++){}
			println a[i]
		}
	}
	
	void arrayTest2(){
		//		acoll.add("helloWorld")
		//		acoll.add('helloWorld123')
		//		println "######################### Groovy���:"
		//		def count
		//
		//		acoll+="1111"
		//		acoll-="java"
		//		acoll<<'hello'<<'world456'<<"789"
		//		int size=acoll.size();
		//		for(int i=0;i<size;i++){
		//			println acoll[i]
		//		}
	}
}


