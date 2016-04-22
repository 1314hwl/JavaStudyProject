package com.cn.sz.generics.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * <title>泛型Generics</title>
 * <p>1.泛型入门<>,jdk1.4以前没有泛型</br>
 * </p>
 * 
 * @author HuWeiLiang
 *
 */
public class GenericsDemo001 {
	
	public static void main(String[] args) {
		List<String>data=new ArrayList<>();
		//data.add(1);//类型检查
        data.add("so easy");
        //jdk1.4以前的使用
        List data1=new ArrayList();
        data1.add("hello world!");
        data1.add(1);
        if(data1.get(1) instanceof Integer){//没有泛型需要手动判断类型
        	int a=(Integer)data1.get(1);
        	System.out.println("a="+a);
        }
        
	}

}
