package com.sujay.practice;

import java.util.Scanner;

/**
 * @author Sujay 19-Feb-2018
 * 
 *         <b>Problem statement</b> : Given an array, X, of N integers and an
 *         array, W , representing the respective weights of X's elements,
 *         calculate and print the weighted mean of X's elements. Your answer
 *         should be rounded to a scale of 1 decimal place (i.e., 12.3 format).
 */
public class WeightedMean {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sizeOfArrays = scanner.nextInt();
		int[] elementArray = new int[sizeOfArrays];
		int[] weights = new int[sizeOfArrays];
		for (int i = 0; i < sizeOfArrays; i++) {
			elementArray[i] = scanner.nextInt();
		}
		for (int i = 0; i < sizeOfArrays; i++) {
			weights[i] = scanner.nextInt();
		}
		scanner.close();
		double result = getWeightedMean(elementArray, weights);
		System.out.println(result);
	}

	private static double getWeightedMean(int[] elementArray, int[] weights) {
		double sumOfWeights = 0;
		double sumOfElements = 0;
		for (int i = 0; i < elementArray.length; i++) {
			int weight = getElementFromWeightArray(weights, i);
			sumOfWeights = weight + sumOfWeights;
			sumOfElements = (elementArray[i] * weight) + sumOfElements;
		}
		return (double) Math.round((sumOfElements / sumOfWeights) * 10) / 10;
	}

	private static int getElementFromWeightArray(int[] weights, int i) {
		return weights[i];
	}
}
