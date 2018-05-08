package com.sujay.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the length of non-repeated numbers in an array
 * @author Sujay
 * 08-May-2018
 */
public class DuplicateValuesInArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 3, 4, 5, 6, 2, 4, 5, 3 };
		usingMap(array);
		usingString(array);
	}

	private static void usingString(int[] array) {
		String str = "";
		for (int i = 0; i < array.length; i++) {
			String temp = String.valueOf(array[i]);
			if (!str.contains(temp)) {
				str = str + temp;
			}
		}
		System.out.println(str.length());
	}

	private static void usingMap(int[] array) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			map.putIfAbsent(array[i], i);
		}
		System.out.println(map.size());
	}
}
