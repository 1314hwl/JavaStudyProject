package com.cn.sz.sort.bubbling;

import java.util.Arrays;
/**
 * 冒泡排序-终极版-减少趟数
 * @author HuWeiLiang
 *
 */
public class BunbblingDemo03 {
	public static void main(String[] args) {
		int[] sortData = { 9, 8, 4, 6, 7 };
		BubbingSort01(sortData);
	}

	private static void BubbingSort01(int[] sortData) {
		int len = sortData.length;
		for (int j = 0; j < len - 1; j++) {
			System.out.println("-----第" + (j + 1) + "趟------");
			boolean isNotChange = true;// 是否有交换的标志
			for (int i = 0; i < len - 1; i++) {
				if (sortData[i] > sortData[i + 1]) {
					int temp = sortData[i + 1];
					sortData[i + 1] = sortData[i];
					sortData[i] = temp;
					isNotChange=false;
				}
				System.out.println(Arrays.toString(sortData));
				if(isNotChange){
					return;
				}
			}
			
		}
	}
}
