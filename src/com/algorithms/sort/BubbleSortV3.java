package com.algorithms.sort;

import java.util.List;

public class BubbleSortV3 {

	private static void bubbleSort(int input[]) {
		System.out.println(" Unsoreted input data");
		System.out.println("**********************");
		printNumbers(input);
		System.out.println("**********************");
		int inLen = input.length;
		int i, j, k;
		for (i = 0; i <= (inLen - 2); i++) {
			for (j = 0; j <= (inLen - 2 - i); j++) {
				k = j + 1;
				if (input[j] > input[k]) {
					swapNumbers(j, k, input);
				} else {
				} // end of if-else statement
			} // end of j for loop
			printNumbers(input);
		} // end of i for loop
	}

	private static void swapNumbers(int j, int k, int[] input) {
		int tmp = input[k];
		input[k] = input[j];
		input[j] = tmp;
	}
	
	private static void printNumbers(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}
	
	private static int[] toIntArray(List<Integer> list)  {
	    int[] ret = new int[list.size()];
	    int i = 0;
	    for (Integer e : list)  
	        ret[i++] = e.intValue();
	    return ret;
	}

	public static void main(String[] args) {
		List<Integer> listOfNumbers = RandomNumber.generate(0, 10);
		bubbleSort(toIntArray(listOfNumbers));
	}

}
