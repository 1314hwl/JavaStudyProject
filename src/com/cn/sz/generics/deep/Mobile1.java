package com.cn.sz.generics.deep;

/**
 * <title>泛型接口-和泛型类同理</title>
 * 
 * @author HuWeiLiang
 *
 */
public interface Mobile1<T> {
	
	void deal(T t);

}

class Iphone1<A> implements Mobile1 {

	@Override
	public void deal(Object t) {
		// TODO Auto-generated method stub
		
	}

}

class Iphone2<T> implements Mobile1<T> {

	@Override
	public void deal(T t) {
		// TODO Auto-generated method stub
		
	}

}

class Iphone3 implements Mobile1<Integer> {

	@Override
	public void deal(Integer t) {
		// TODO Auto-generated method stub
		
	}

}
