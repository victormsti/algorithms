package main;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {

		String normalString = "VictorMatheus";
		normalString = normalString.toLowerCase();
		
		char[] sortedArray = normalString.toCharArray();
		Arrays.sort(sortedArray);
		
		String newString = new String(sortedArray);
		
		System.out.println(normalString);
		System.out.println(newString);
	}

}
