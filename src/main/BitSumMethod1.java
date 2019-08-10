package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BitSumMethod1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
			String arr[] = new String[2];
			String biggest = "";
			
			arr[0] = s.next();
			arr[1] = s.next();
			biggest = checkBiggest(arr);
			
			bitSum(arr, biggest.length());
	}

	// do the sum
	public static void bitSum(String[] arr, int max) {
		
		StringBuilder str = new StringBuilder();
		char[] bin1 = String.format(("%" + (max < 10 ? "0"+max : max) + "d"), Integer.parseInt(arr[0])).toCharArray();
		char[] bin2 = String.format(("%" + (max < 10 ? "0"+max : max) + "d"), Integer.parseInt(arr[1])).toCharArray();
		
		boolean increment = false;
		// loop the array starting from its final to the begin
		for (int i = max -1; i >= 0; i--) {
				if(Character.getNumericValue(bin1[i]) + Character.getNumericValue(bin2[i]) == 2) {
					if(!increment) {
					str.append('0');
					increment = true;
					}
					else {
						str.append('1');
						increment = true;
					}
				}
				if(Character.getNumericValue(bin1[i]) + Character.getNumericValue(bin2[i]) == 1) {
					if(!increment) {
					str.append('1');
					increment = false;
					}
					else {
						str.append('0');
						increment = true;
					}
				}
				if(Character.getNumericValue(bin1[i]) + Character.getNumericValue(bin2[i]) == 0) {
					if(!increment) {
					str.append('0');
					increment = false;
					}
					else {
						str.append('1');
						increment = false;
					}
				}
		}
		if(increment)
			str.append('1');
		
		str = str.reverse();
		System.out.println("The sum is: " + str);
		System.out.println("The int value is: " + convertToInt(str.toString().toCharArray()));
	}
	
	// check the String with the biggest length
	public static String checkBiggest(String[] arr) {
		String biggest = new String();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()>biggest.length())
				biggest =  arr[i];	
		}
		return biggest;
		
	}
	
	// necessary to convert bit to int
	public static Map<Integer,Integer> getBitSequence(){
		Map<Integer, Integer> bitSequence = new HashMap<>();
		bitSequence.put(0, 1);
		bitSequence.put(1, 2);
		bitSequence.put(2, 4);
		bitSequence.put(3, 8);
		bitSequence.put(4, 16);
		bitSequence.put(5, 32);
		bitSequence.put(6, 64);
		bitSequence.put(7, 128);
		bitSequence.put(8, 256);
		
		return bitSequence;
	}
	
	public static int convertToInt(char[] arr) {
		StringBuilder str = new StringBuilder();
		arr = str.append(arr).reverse().toString().toCharArray();
		int intValue = 0;
		Map<Integer,Integer> bitSequence = getBitSequence();

		for (int i = arr.length -1; i >=0; i--) {
			if(arr[i] == '1')
				intValue += bitSequence.get(i);
		}
		return intValue;
	}
}
