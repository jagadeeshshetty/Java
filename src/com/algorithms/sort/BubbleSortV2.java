package com.algorithms.sort;

public class BubbleSortV2 {

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
					// System.out.println("SWAP: " + input[j+1] + " > " + input[j]);
				} else {
					// System.err.println("SKIP SWAP: " + input[j] + " < " + input[j+1]);
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

	public static void main(String[] args) {
		System.out.println("Program Starts...");
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubbleSort(input);
		System.out.println("Program Ends...");
	}

}
