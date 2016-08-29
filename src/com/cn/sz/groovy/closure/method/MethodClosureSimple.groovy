package com.cn.sz.groovy.closure.method

class MethodClosureSimple {
	int limit

	MethodClosureSimple(int limit){
		this.limit = limit
	}

	def validate(String value){
		return value.length() <= limit
	}
}
