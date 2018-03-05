package com.sujay.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * You are given a phone book that consists of people's names and their phone
 * number. After that you will be given some person's name as query. For each
 * query, print the phone number of that person.
 * 
 * @author Sujay 02-Mar-2018
 */
public class JavaMap {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // take the integer as input
		in.nextLine();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine(); // take name and store in a map as a
											// key
			int phone = in.nextInt(); // take phone number of that person &
										// again store in a map as value for
										// above key
			in.nextLine();
			map.put(name, phone);
		}
		while (in.hasNext()) {
			String name = in.nextLine();
			if (!map.containsKey(name)) {
				System.out.println("Not found");
			} else {
				System.out.println(name + "=" + map.get(name));
			}
		}
		in.close();
	}

}
