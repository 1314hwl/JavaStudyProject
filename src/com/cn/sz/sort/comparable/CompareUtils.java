package com.cn.sz.sort.comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareUtils {
	/**
	 * Comparator 实现排序Ï 
	 * @param sortData
	 * @param com
	 */
	public static <T extends Comparable<T>> void sort(Object[] sortData, Comparator com) {
		int len = sortData.length;
		for (int j = 0; j < len - 1; j++) {
			System.out.println("-----第" + (j + 1) + "趟------");
			boolean isNotChange = true;// 是否有交换的标志
			for (int i = 0; i < len - 1; i++) {
				if (com.compare(sortData[i], sortData[i + 1]) > 1) {
					Object temp = sortData[i + 1];
					sortData[i + 1] = sortData[i];
					sortData[i] = temp;
					isNotChange = false;
				}
				System.out.println(Arrays.toString(sortData));

			}
			if (isNotChange) {
				return;
			}
		}
	}

	/**
	 * 
	 * @param list
	 */
	public static <T extends Comparable<T>> void sort(List<T> list) {
		Object[] objArrays = list.toArray();
		sort(objArrays);// 这里调用的是对象数组的排序
		int size = objArrays.length;
		for (int i = 0; i < size; i++) {
			list.set(i, (T) objArrays[i]);
		}
	}

	/**
	 * 泛型数组的排序
	 * 
	 * @param sortData
	 */
	public static <T extends Comparable<T>> void sort(T[] sortData) {
		int len = sortData.length;
		for (int j = 0; j < len - 1; j++) {
			System.out.println("-----第" + (j + 1) + "趟------");
			boolean isNotChange = true;// 是否有交换的标志
			for (int i = 0; i < len - 1; i++) {
				if (((Comparable) sortData[i]).compareTo(sortData[i + 1]) < 0) {
					T temp = sortData[i + 1];
					sortData[i + 1] = sortData[i];
					sortData[i] = temp;
					isNotChange = false;
				}
				System.out.println(Arrays.toString(sortData));

			}
			if (isNotChange) {
				return;
			}
		}
	}

	/**
	 * 对象数组的排序
	 * 
	 * @param sortData
	 */
	public static void sort(Object[] sortData) {
		int len = sortData.length;
		for (int j = 0; j < len - 1; j++) {
			System.out.println("-----第" + (j + 1) + "趟------");
			boolean isNotChange = true;// 是否有交换的标志
			for (int i = 0; i < len - 1; i++) {
				if (((Comparable) sortData[i]).compareTo(sortData[i + 1]) < 0) {
					Object temp = sortData[i + 1];
					sortData[i + 1] = sortData[i];
					sortData[i] = temp;
					isNotChange = false;
				}
				System.out.println(Arrays.toString(sortData));

			}
			if (isNotChange) {
				return;
			}
		}
	}

}
