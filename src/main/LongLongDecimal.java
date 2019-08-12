package main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LongLongDecimal {

	public static void main(String[] args) {

		
		BigDecimal a  = new BigDecimal("355.0");
		BigDecimal b = new BigDecimal("113.0");
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int n = s.nextInt();

			System.out.println(a.divide(b,n, RoundingMode.FLOOR));
		}
	}
}
