package com.cn.sz.innerclass.anonymity;
/**
 * 匿名内部类
 * @author HuWeiLiang
 *
 */
public class Chinese {
	
	public void deal(Person p){
		p.speak();
	}
	
	public static void main(String[] args) {
		Chinese c=new Chinese();
		c.deal(new Person(){

			@Override
			public void speak() {
				System.out.println("speak 中国话......");
				
			}
			
		});
	}

}
