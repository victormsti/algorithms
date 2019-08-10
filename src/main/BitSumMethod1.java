package main;

import java.math.BigInteger;
import java.util.Scanner;

public class BitSumMethod1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String bin1 = s.next();
		String bin2 = s.next();

		bitSum(bin1, bin2);
	}

	// do the sum
	public static void bitSum(String strBin1, String strBin2) {

		int max = Math.max(strBin1.length(), strBin2.length());
		StringBuilder str = new StringBuilder();
		char[] bin1 = String.format(("%0" + max + "d"), new BigInteger(strBin1)).toString().toCharArray();
		char[] bin2 = String.format(("%0" + max + "d"), new BigInteger(strBin2)).toString().toCharArray();

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
	}
}
