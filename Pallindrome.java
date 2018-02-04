package com.sujay.practice;

import java.util.Scanner;

/**
 * This class checks whether given string is Pallindrome or not e.g mirror image
 * of "madam" will be "madam" and that's why "madam" is Pallindrome
 * 
 * @author Sujay.Agrawal
 *
 */
public class Pallindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		boolean givenStringIsPallindrome = isPallindrome(inputString);
		if (givenStringIsPallindrome) {
			System.out.println(inputString + " is pallindrome");
		} else {
			System.out.println(inputString + " is not a pallindrome");
		}
		scanner.close();
	}

	public static boolean isPallindrome(String inputString) {
		StringBuilder builder = new StringBuilder(inputString);
		if (inputString.equals(builder.reverse().toString())) {
			return true;
		} else {
			return false;
		}
	}
}
