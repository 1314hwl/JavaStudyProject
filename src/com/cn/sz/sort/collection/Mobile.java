package com.cn.sz.sort.collection;

public class Mobile implements Comparable<Mobile>{
	private int price;// 价格
	private String phoneType;// 手机类型
	public Mobile(String phoneType,int price) {
		super();
		this.price = price;
		this.phoneType = phoneType;
	}
	public Mobile() {
		super();
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	@Override
	public int compareTo(Mobile o) {
		return this.price-o.price;
	}
	@Override
	public String toString() {
		return "Mobile [price=" + price + ", phoneType=" + phoneType + "]";
	}
	
	
	
	
	
	
	
	
}
