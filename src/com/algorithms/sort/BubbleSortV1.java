package com.algorithms.sort;

/*
 * Pseudo-code:
 * A --> 2,5,7,8,12
 * 
 * for i=0 to A.length-2     | i         |    j              |Number of operations. Including Swaps and comparison.|               
 * 		for j=0 to A.length-2-i|i=0        |0<=j<=(n-2)        |(n-1)                                                |
 * 			if A[j] > A[j+1]     |i=1        |0<=j<=(n-3)        |(n-2)                                                |
 * 				tmp = A[j+1]       |.          |.                  | .                                                   |
 * 				A[j+1] = A[j]      |.          |.                  | .                                                   |
 * 				A[j] = tmp         |i=(n-2)    |0<=j<=(n-3)        | 1                                                   |
 * 
 * Time for this algo varies as the 'quadratic function of the data size'. This is size of an array.
 */

public class BubbleSortV1 {

	public static void bubbleSort(int[] input) {
		int inLen = input.length;
		int i, j, tmp;
		for (i = 0; i <= (inLen - 2); i++) {
			for (j = 0; j <= (inLen - 2 - i); j++) {
				if (input[j] > input[j + 1]) {
					tmp = input[j + 1];
					input[j + 1] = input[j];
					input[j] = tmp;
					System.out.println("SWAP: " + input[j + 1] + " > " + input[j]);
				} else {
					System.err.println("SKIP SWAP: " + input[j] + " < " + input[j + 1]);
				} // end of if-else statement
			} // end of j for loop
		} // end of i for loop
	}

	public static void main(String[] args) {
		System.out.println("Program Starts...");
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubbleSort(input);
		System.out.println("Program Ends...");
	}

}
