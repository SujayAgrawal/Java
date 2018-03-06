package com.sujay.practice;

import java.util.Scanner;

/**
 * Given an array of integers, calculate which fraction of its elements are
 * positive, which fraction of its elements are negative, and which fraction of
 * its elements are zeros. Print the decimal value of each fraction on a new
 * line.
 * 
 * Print upto 6 decimal places
 * 
 * @author Sujay 07-Mar-2018
 */
public class UptoNdecimalPlaces {

	static void plusMinus(int[] arr) {
		float numberOfOccurencesOfPositiveVal = 0;
		float numberOfOccurencesOfNegativeVal = 0;
		float numberOfOccurencesOfZeroVal = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				numberOfOccurencesOfPositiveVal++;
			} else if (arr[i] < 0) {
				numberOfOccurencesOfNegativeVal++;
			} else {
				numberOfOccurencesOfZeroVal++;
			}
		}
		System.out.println(String.format("%.6f", numberOfOccurencesOfPositiveVal / arr.length));
		System.out.println(String.format("%.6f", numberOfOccurencesOfNegativeVal / arr.length));
		System.out.println(String.format("%.6f", numberOfOccurencesOfZeroVal / arr.length));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		plusMinus(arr);
		in.close();
	}
}
