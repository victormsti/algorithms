package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class ReducedForm {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 40, 80, 60 };
		// result = {1,2,3,5,4}
		System.out.println(reducedForm(arr).toString());
	}

	public static int[] reducedForm(int[] arr) {

		Map<Integer, Integer> values = new HashMap<>();
//		List<Integer> l = new ArrayList<>();
//		Stack<Integer> s = new Stack<>();
//		Queue<Integer> q = new LinkedList<>();
		int[] aux = new int[arr.length];

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			aux[i] = arr[i];
		}
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < n; i++) {
			values.put(arr[i], count + 1);
			count++;
		}

		for (int j = 0; j < n; j++) {
			aux[j] = values.get(aux[j]);
		}
		return aux;
	}

}
