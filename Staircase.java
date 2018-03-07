package com.sujay.practice;

import java.util.Scanner;

/**
 * print a staircase of size n
 * example:
   #
  ##
 ###
####
 * @author Sujay
 * 07-Mar-2018
 */
public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sizeOfStairs = in.nextInt();
		staircase(sizeOfStairs);
		in.close();
	}

	static void staircase(int sizeOfStairs) {
		for(int i = 1; i <= sizeOfStairs; i++) {
			for(int j = 1; j <= sizeOfStairs-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}