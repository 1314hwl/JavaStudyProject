package com.cn.sz.Iterator;

import java.util.Arrays;
import java.util.Iterator;
/**
 * 1.add 2.for...each..需要实现Iterable接口
 * @author HuWeiLiang
 *
 */
public class MyDeepList001 implements Iterable<String>{

	private String[] elem = new String[5];

	private int size = 0;

	public int getSize() {
		return size;
	}

	/**
	 * 在末尾添加元素
	 * @param e
	 */
	public void add(String e) {
		if (this.size == elem.length) {
			elem = Arrays.copyOf(elem, elem.length + 5);//容量不够,扩容
		}
		elem[size++] = e;
	}

	public Iterator iterator() {
		return new Iterator() {// 创建Iterator迭代器接口实现类(匿名)的对象
			private int cursor = -1;

			public boolean hasNext() {
				if (cursor + 1 < size) {
					return true;
				}
				return false;
			}

			public String next() {
				return elem[++cursor];
			}

			public void remove() {
				// 移动数组的元素
				System.arraycopy(elem, cursor + 1, elem, cursor, size - (cursor + 1));
				size--;
				cursor--;

			}
		};
	}

	public static void main(String[] args) {
          MyDeepList001 list=new MyDeepList001();
          list.add("1");
          list.add("2");
          list.add("3");
          list.add("4");
          list.add("5");
          list.add("6");
//          Iterator it=list.iterator();
//          while(it.hasNext()){
////        	  it.next();
//        	  System.out.println(it.next());
//          }
          
          for(String e:list){//需要实现java.lang.iterable接口
        	  System.out.println(e);
          }
        	  
	}

}
