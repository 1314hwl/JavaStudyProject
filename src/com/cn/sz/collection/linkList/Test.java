package com.cn.sz.collection.linkList;

public class Test {
	
	public static void main(String[] args) {
		MyLinkList myLinkList=new MyLinkList();
		myLinkList.add("1");
		myLinkList.add("2");
		myLinkList.add("3");
		System.out.println("myLinkList:"+myLinkList.get(2));
		myLinkList.add(2,"5");
		System.out.println("size："+myLinkList.size());
		System.out.println("myLinkList:"+myLinkList.get(0));
		System.out.println("myLinkList:"+myLinkList.get(1));
		System.out.println("myLinkList:"+myLinkList.get(2));
		System.out.println("myLinkList:"+myLinkList.get(3));
	}

}
