package main;

import java.util.Scanner;

public class BitSumMethod1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int biggest = 0;

		String bin1 = s.next();
		String bin2 = s.next();
		biggest = checkBiggest(bin1, bin2);

		bitSum(bin1, bin2, biggest);
	}

	// do the sum
	public static void bitSum(String strBin1, String strBin2, int max) {

		StringBuilder str = new StringBuilder();
		char[] bin1 = String.format(("%" + max + "d"), Integer.parseInt(strBin1)).toCharArray();
		char[] bin2 = String.format(("%" + max + "d"), Integer.parseInt(strBin2)).toCharArray();

		boolean increment = false;
		// loop the array starting from its final to the begin
		for (int i = max - 1; i >= 0; i--) {
			if (Character.getNumericValue(bin1[i]) + Character.getNumericValue(bin2[i]) == 2) {
				if (!increment) {
					str.append('0');
					increment = true;
				} else {
					str.append('1');
					increment = true;
				}
			}
			if (Character.getNumericValue(bin1[i]) + Character.getNumericValue(bin2[i]) == 1) {
				if (!increment) {
					str.append('1');
					increment = false;
				} else {
					str.append('0');
					increment = true;
				}
			}
			if (Character.getNumericValue(bin1[i]) + Character.getNumericValue(bin2[i]) == 0) {
				if (!increment) {
					str.append('0');
					increment = false;
				} else {
					str.append('1');
					increment = false;
				}
			}
		}
		if (increment)
			str.append('1');

		str = str.reverse();
		System.out.println("The sum is: " + str);
		System.out.println("The int value is: " + Integer.parseInt(str.toString(), 2));
	}

	// check the String with the biggest length
	public static int checkBiggest(String bin1, String bin2) {
		int biggest = 0;
		if (bin1.length() > bin2.length()) {
			biggest = bin1.length();
		} else if (bin2.length() > bin1.length()) {
			biggest = bin2.length();
		}
		// if they have the same length, return anyone
		else
			biggest = bin1.length();

		return biggest;

	}
}
