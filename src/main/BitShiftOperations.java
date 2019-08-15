package main;

public class BitShiftOperations {

	public static void main(String[] args) {

		//doShiftRight(8, 3);
	}

	public int doShiftRight(int number, int x) {
		if (x >= Integer.toBinaryString(number).length())
			throw new IllegalArgumentException("The shift can't be higher than the number");
		
		return Integer.parseInt(Integer.toBinaryString(number >> x), 2);
	}

	public int doShiftLeft(int number, int x) {
		return Integer.parseInt(Integer.toBinaryString(number << x), 2);
	}
}
