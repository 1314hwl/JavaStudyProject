package com.cn.sz.groovy.closure.method


class MethodClosureTest {
	static def map=['a':1,'b':2,'c':3]


	static main(def args){
		MethodClosureSimple first = new MethodClosureSimple(6)
		MethodClosureSimple second = new MethodClosureSimple(4)

		def firstClosure = first.&validate; //方法作为闭包

		def words=['Hello', 'Synvata', 'I', 'Love', 'you']

		println words.findAll(firstClosure)         //[Hello, I, Love, you]
		println words.findAll(second.&validate)     //[I, Love, you]

		println "###########################################"


		/*直接把闭包作为参数传递，这是常用的方式*/
		map.each{key,value -> map[key] = value * 2 }
		//个人理解:each,把map中没一个key,value作为参数循环遍历
		println map        //[a:2, b:4, c:6]

		/*将闭包对象赋值给变量doubler*/
		def doubler={key,value -> map[key] = value * 2 }
		//和上面原理一样
		map.each(doubler)
		println map        //[a:4, b:8, c:12]


		/*reference.&操作符引用方法作为一个闭包*/
		doubler=this.&doubleMethod
		//个人理解:each,把map中没一个entry作为参数循环遍历
		map.each(doubler)
		println map        //[a:8, b:16, c:24]

		println "###########################################调用闭包:"


		def col={println 'Hello, Groovy'}
		col();        //Hello, Groovy
		col.call()    //Hello, Groovy

		println "###########################################"
		def slow=benchmark(1000){ (int)it / 2 }
//		def fast=benchmark(1000){ it.intdiv(2) }
		println slow
//		println fast

	}


	/*声明一个普通的方法*/
	static def doubleMethod(entry){

		map[entry.key]=entry.value * 2
	}

	static def benchmark(repeat,Closure worker){
		def start=System.currentTimeMillis()
		repeat.times{worker(it)}
		def stop=System.currentTimeMillis()
		return stop-start
	}


}
