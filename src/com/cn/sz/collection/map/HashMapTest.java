package com.cn.sz.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String,String>map=new HashMap<>();
		map.put("001","张学友");
		map.put("002","刘德华");
		map.put("003","郭富城");
		map.put("004","黎明");
		
		Collection c=map.values();
		System.out.println(c.toString());
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Set<String>set=map.keySet();
		Iterator itSet=set.iterator();
		while(itSet.hasNext()){
			System.out.println(map.get(itSet.next()));
		}
		
		Set<Map.Entry<String, String>>entrySet=map.entrySet();
		Iterator itEntry=entrySet.iterator();
		
		while(itEntry.hasNext()){
			Entry entry=(Entry) itEntry.next();
			System.out.println(entry.getValue());
		}
		
	
			
	}

}
