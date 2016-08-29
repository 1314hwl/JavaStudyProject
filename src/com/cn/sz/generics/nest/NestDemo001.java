package com.cn.sz.generics.nest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * <title>泛型的嵌套</title>
 * 
 * @author HuWeiLiang
 *
 */
public class NestDemo001 {

	public static void main(String[] args) {
		Java<String> java = new Java<String>();
		java.setT("java programme...");
		System.out.println(java.getT());
		Programme<Java<?>> p = new Programme<Java<?>>();
		p.setT(java);
		Java<?> java1 = p.getT();
		System.out.println(java1.getT());
		
		Map<String ,String >map=new HashMap<String,String>();
		map.put("test1", "1234");
		map.put("test2", "12345");
		Set<Map.Entry<String, String>>sets=map.entrySet();
		for(Entry<String, String> e:sets){
			System.out.println("key:"+e.getKey()+"  value:"+e.getValue());
		}
		
	}

}
