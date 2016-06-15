package com.cn.sz.groovy.model

class Mobile {
	//groovy中变量默认为私有,自动提供get,set方法,结尾;可不加,方法默认public
	String name
	int price
	def os
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", os=" + os + "]";
	}
}
