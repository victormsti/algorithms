package main;

import java.util.Arrays;

public class Quadruplet {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 3, 5, 6, 3, 0, 2, 3, 9, 8, 7 };
		int[] arr2 = new int[4];

		int s = 20;

		Arrays.sort(arr);

		arr2 = findQuadruplet(arr, s);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("--------------");
		for (int z = 0; z < arr2.length; z++) {
			System.out.println(arr2[z]);
		}
	}

	public static int[] findQuadruplet(int[] arr, int s) {

		int[] arr2 = new int[4];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		if (arr.length < 4) {
			System.out.println("No quadruplet");
			return null;
		}

		for (int i = 0; i < arr.length; i++) {
			a = arr[i];
			for (int j = 1; j < arr.length - 1; j++) {
				b = arr[j];
				for (int k = 2; k < arr.length; k++) {
					c = arr[k];
					for (int l = 3; l < arr.length; l++) {
						d = arr[l];

						if (a + b + c + d == s)
							arr2 = new int[] { a, b, c, d };
					}
				}
			}
		}
		return arr2;
	}
}
