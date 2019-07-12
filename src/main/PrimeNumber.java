package main;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		boolean isPrime = true;
		
		for(int i = 2; i < num/2; i ++) {
			int temp = num%i;
			
			if(temp == 0) {
				isPrime = false;
				break;
			}
		}
		
		System.out.println("The number " + num + (isPrime ? " is prime!" : " is not prime!"));
	}

}
