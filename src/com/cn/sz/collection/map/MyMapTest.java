package com.cn.sz.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * <title>HashMap,HashTable</title>
 * <p>
 * 不同点<br>
 * 1.HashMap 的key,value可以是null,HashTable 不可以；<br>
 * 2.HashMap 基于Map实现，HashTable 基于Dictionary;<br>
 * 3.HashMap 线程不安全,效率高。HashTable线程安全，效率低；<br>
 * </p>
 * 
 * @author HuWeiLiang
 *
 */
public class MyMapTest {

	public static void main(String[] args) {
		// MyMap001 map=new MyMap001();
		// map.put("android", new Mobile("三星"));
		// map.put("android1", new Mobile("华为"));
		// Mobile m=(Mobile) map.get("android");
		// System.out.println(m.getName()+" size:"+map.size());
		// System.out.println(map.containsValue(new Mobile("三星")));
		// Map map=new HashMap();

		// MyMap002 map002=new MyMap002();
		// map002.put("android", new Mobile("中兴"));
		// map002.put("android", new Mobile("中兴1"));
		// Mobile m=(Mobile) map002.get("android");
		// System.out.println(m.getName());

		Map tempMap = new HashMap<>();
		tempMap.put(null, "123");
		tempMap.put(null, "456");
		System.out.println(tempMap.get(null));

		Set<Map.Entry> set = tempMap.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			System.out.println("key:" + entry.getKey() + "  value:" + entry.getValue());

		}

		System.out.println("----------------");

		Hashtable table = new Hashtable<>();
		table.put("1", "123");
		table.put("1", "456");

		Set<Map.Entry> set1 = table.entrySet();
		Iterator it1 = set1.iterator();
		while (it1.hasNext()) {
			Entry entry = (Entry) it1.next();
			System.out.println("key:" + entry.getKey() + "  value:" + entry.getValue());

		}

	}

}
