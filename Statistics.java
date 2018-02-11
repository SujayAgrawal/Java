package com.sujay.practice;

/**
 * This class is responsible for calculating mean, mode & median of given
 * elements in array of integer type
 * 
 * @author Sujay 11-Feb-2018
 */
public final class Statistics {

	/**
	 * This method calculates mean of given elements i.e sum of all elements
	 * divided by number of elements
	 * 
	 * @param array
	 * @return mean of given elements
	 */
	public double getMean(int[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum / array.length;
	}

	/**
	 * This method calculates median of given elements i.e middle element in a
	 * given array
	 * 
	 * @param array
	 * @return median of given elements in array
	 */
	public double getMedian(int[] array) {
		// find the middle element in an array
		// do one thing instead of asking for sorted array, sort the array
		// inside this method
		// create a method to sort the array, call the method here & get the
		// array sorted
		// calculate the length of given array
		array = getSortedArray(array);
		int length = array.length;
		if (isLengthOfArrayEven(length)) {
			// then get the n=(length/2)th element and (n-1)th element
			// add both the elements and divide the sum by 2, result will be
			// median !
			int middleElement = length / 2;
			double element1 = array[middleElement];
			double element2 = array[middleElement - 1];
			return (element1 + element2) / 2;
		} else {
			return array[length / 2];
		}
	}

	public double getMode(int[] array) {
		// get the array sorted in
		// calculate number of occurrences of each element
		// Map<element,numberOfOccurrences>
		// the element which has occurred most number of times in an array will
		// be mode
		// but if there is a conflict in numberOfOccurrences then the smallest
		// element will be declared as mode
		return 0;
	}

	private boolean isLengthOfArrayEven(int length) {
		return (length % 2 == 0);
	}

	private int[] getSortedArray(int[] givenArray) {
		int arrayLength = givenArray.length;
		while (arrayLength != 0) {
			for (int currentIndex = 0; currentIndex < (arrayLength - 1); currentIndex++) {
				int nextIndex = currentIndex + 1;
				if (givenArray[currentIndex] > givenArray[nextIndex]) {
					// swap the values
					int temp;
					temp = givenArray[nextIndex];
					givenArray[nextIndex] = givenArray[currentIndex];
					givenArray[currentIndex] = temp;
				}
			}
			arrayLength--;
		}
		return givenArray;
	}
}
