package com.sujay.practice;

import java.util.Scanner;

/**
 * Find the sum of all the multiples of 3 or 5 below N. first input T that
 * denotes number of test cases. For each test case, print an integer that
 * denotes the sum of all the multiples of 3 or 5 below N. Source of problem -
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler001
 * 
 * @author Sujay 09-Feb-2018
 * 
 *         Solution : use Arithmetic progression to improve time complexity and
 *         remove extra looping
 */
public class SumOfMultiplesOfxAndy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();

		for (int i = 0; i < numberOfTestCases; i++) {
			long n = scanner.nextLong();
			long result = (sumDivisibleBy(n - 1, 3) + sumDivisibleBy(n - 1, 5)) - sumDivisibleBy(n - 1, 15);
			System.out.println(result);
		}
		scanner.close();
	}

	private static long sumDivisibleBy(long inputMinusOne, long divisibleBy) {
		return divisibleBy * (inputMinusOne / divisibleBy) * ((inputMinusOne / divisibleBy) + 1) / 2;
	}
}
