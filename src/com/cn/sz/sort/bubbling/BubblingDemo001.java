package com.cn.sz.bubbling;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 冒泡排序-基础版本
 * 
 * @author HuWeiLiang
 *
 */
public class BubblingDemo001 {
	public static void main(String[] args) {

		int[] sortData = { 9, 8, 7, 6, 4 };
		BubbingSort01(sortData);
	}

	private static void BubbingSort01(int[] sortData) {
		int len = sortData.length;
		for (int j = 0; j < len - 1; j++) {
			System.out.println("-----第" + (j + 1) + "趟------");
			for (int i = 0; i < len - 1; i++) {
				if (sortData[i] > sortData[i + 1]) {
					int temp = sortData[i + 1];
					sortData[i + 1] = sortData[i];
					sortData[i] = temp;
				}
				System.out.println(Arrays.toString(sortData));
			}
		}
	}

}