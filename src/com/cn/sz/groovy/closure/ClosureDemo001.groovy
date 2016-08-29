package com.cn.sz.groovy.closure

import org.codehaus.groovy.transform.trait.Traits.Implemented;



class ClosureDemo001 implements Serializable{


	public ClosureDemo001(){
	}
	
	
	
	


	void closureTest1(){
		def acoll =["Groovy", 1, "Ruby"]
		for(Iterator iter = acoll.iterator(); iter.hasNext();){
			println iter.next()
		}
		println "#################### Groovy闭包的输出:"
		acoll.each{ println it }//这里就是一个闭包的表现
	}
	/**
	 * 闭包语法:在一个方法调用的后面，放置闭包代码在一对花括号里，闭包的参数和代码通过（->）进行分隔。
	 * 1.简单的声明方式
	 * @Description 
	 * @author henry
	 */
	void closureTest2(){
		def log=''
		(1..10).each{ counter -> log += counter }//counter是参数传递的是1...10的每一个值
		println log  //12345678910
		println "####################### Groovy it(魔术变量参数输出,魔术变量不需要像counter一样声明):"
		log=''
		(1..10).each{log += it }
		println log  //12345678910
	}
	/**
	 * 2.使用赋值的方式声明闭包
	 * @Description 
	 * @author henry
	 */
	void closureTest3(){


	}
	def printer={ line -> println line}
	
	
	def Closure getPrinter(){
		return {line -> println line}
	}
}
