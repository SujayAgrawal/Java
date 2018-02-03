package com.sujay;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Find nth largest integer in a given array
 * 
 * @ @author Sujay.Agrawal, First, sort the array in ascending order then find
 *   the nth index of given array
 */
public class FindNthLargestInArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] givenArray = { 5, 6, 9, 2, 1 };
		int arrayLength = givenArray.length;
		while (arrayLength != 0) {
			for (int currentIndex = 0; currentIndex < ((givenArray.length) - 1); currentIndex++) {
				if (givenArray[currentIndex] > givenArray[currentIndex + 1]) {
					// swap the values
					int temp;
					temp = givenArray[currentIndex + 1];
					givenArray[currentIndex + 1] = givenArray[currentIndex];
					givenArray[currentIndex] = temp;
				}
			}
			arrayLength--;
		}
		printSortedArray(givenArray);
		System.out.println("which nth largest number you want to find in the given array : ");
		try {
			int inputNumber = scanner.nextInt();
			System.out.println(givenArray[givenArray.length - inputNumber]);
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("You have entered either 0 or number greater than length of array");
		} catch (InputMismatchException inputMismatchException) {
			System.out.println("input by you is not a number");
		}
		scanner.close();

	}

	private static String printSortedArray(int[] array) {
		int index = 0;
		int length = array.length;
		System.out.println("Sorted Array in ascending order : ");
		while ((length != 0) && (index != array.length)) {
			System.out.print(array[index] + " ");
			length--;
			index++;
		}
		System.out.println();
		return null;
	}
}
