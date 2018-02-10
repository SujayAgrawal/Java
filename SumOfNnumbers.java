package com.sujay.practice;

import java.util.Scanner;

/**
 * Find the sum of n numbers divisible by x
 * Go revise arithmetic progression ! :D
 * Solution:
 * 			x + x(2) + x(3).....+ x(n) = x[1+2+3+...+n] = x[sum of n natural numbers] = x[n*(n+1)/2]
 * @author Sujay
 * 10-Feb-2018
 */
public class SumOfNnumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("sum of how many natural numbers u want to find : ");
		long input = scanner.nextLong();
		System.out.println("and that should be divisible by : ");
		int divisibleBy = scanner.nextInt();
		System.out.println("sum of "+input+" natural numbers divisible by "+divisibleBy+" is "+sum(input,divisibleBy));
		scanner.close();
	}
	
	private static long sum(long inputValue, int divisibleBy) {
		return divisibleBy*(inputValue*(inputValue+1)/2);
	}

}
