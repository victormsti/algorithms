package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwinPairs {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		for (int i = 0; i < t; i++) {
			int n = s.nextInt();

			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = s.nextInt();
			}

			Map<Integer,Integer> list = new HashMap<>();
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				
				if (!list.isEmpty() && list.containsKey(arr[j])) {
					list.remove(arr[j]);
					count += 2;
				}
				else {
					list.put(arr[j], arr[j]);
				}
			}
			System.out.println(count);
		}
	}
}