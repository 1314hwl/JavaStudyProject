package com.cn.sz.generics.deep;

/**
 * <title>泛型的继承</title>
 * <p>
 * 1.保留 </br>
 * 1>完全保留 </br>
 * 2>不完全保留</br>
 * 2.不保留</br>
 * 3.属性以及方法随位置而定
 * 1>.如果子类保留了父类泛型->子类为泛型</br>
 * 2>.如果子类不保留父类泛型->子类按需实现</br>
 * 3>.子类重写的方法，随父类而定</br>
 * 4>.子类中使用父类的属性随父类而定age</br>
 * </p>
 * 
 * 
 * 
 * @author HuWeiLiang
 *
 * @param <T1>
 * @param <T2>
 */
public abstract class Mobile<T1, T2> {

	T1 age;

	public abstract void test(T2 name);

}

// 完全保留,泛型子类（保留了父类的泛型）
class Android<T1, T2, K, V> extends Mobile<T1, T2> {

	@Override
	public void test(T2 name) {
		// 泛型随父类

		// this.age-->T1

	}

	public void test2(T1 a) {

	}

}

// 部分保留
class Android3<T2> extends Mobile<Integer, T2> {

	@Override
	public void test(T2 name) {
		// 随父类
		// this.age-->Integer
	}

}

// 不擦除
// 具体类型--->按需实现
class Android2 extends Mobile<String, Integer> {

	@Override
	public void test(Integer name) {
		// TODO Auto-generated method stub
		System.out.println(age);// age随父类
		// this.age ---->String

	}

}

// 没有类型,擦除了Object
class Android1 extends Mobile {

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		// this.age--->Object

	}// 这里不写相当于写了<Object,Object>

}
