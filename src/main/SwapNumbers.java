package main;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		System.out.println("Before swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// do the swap without a third number
		a = a + b; // first we need to sum both numbers
		b = a - b;
		a = a - b;

		System.out.println("After swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("Select values to X and Y");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();

		System.out.println("Two or three variables? (2 for two | 3 for three");

		int vrNumber = in.nextInt();

		if (vrNumber == 2) {
			x = x + y;
			y = x - y;
			x = x - y;
			System.out.println("X = " + x);
			System.out.println("Y = " + y);
		}

		else if (vrNumber == 3) {
			int temp = 0;
			temp = x;
			x = y;
			y = temp;

			System.out.println("X = " + x);
			System.out.println("Y = " + y);
		} else
			System.out.println("Invalid number!");
	}

}
