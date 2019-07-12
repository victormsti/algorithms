package main;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		// Array with 20 numbers
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 7, 4, 3, 5, 6, 3, 0, 2, 3, 9, 8, 7 };
//		Arrays.sort(arr);

		int value = arr[Arrays.binarySearch(arr,0,arr.length,9)];
		int temp = Arrays.binarySearch(arr, 0, arr.length, 9);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		System.out.println("--");
		System.out.println(temp);
		System.out.println(value);
		
//		Arrays array = new Array();
	}

}
