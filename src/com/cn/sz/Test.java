package com.cn.sz;
/**
 * 测试类
 * @author HuWeiLiang
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		//
		int power[] = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
		int data[]={4,5,0,6,2,1,1,9,9,1,0,8,2,0,0,8,2};
		int sum=0;
		int j=data.length;
		for(int i=0;i<data.length;i++){
//			System.out.println("data[i]:"+data[i]);
//			System.out.println("j:"+j);
			int temp=(int)Math.pow(2, j);
			int temp1=temp*data[i];
			sum=sum+temp1;
			System.out.println("temp1:"+temp1+"sum:"+sum);
			j--;
		}
		System.out.println("sum:"+sum);
	}

}
