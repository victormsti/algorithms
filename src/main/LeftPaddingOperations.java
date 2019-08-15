package main;

public class LeftPaddingOperations {

	public static void main(String[] args) {

	}
	
	public String doLeftPadding1(String bin, int x) {
		
		return String.format("%1$" + x + "s", bin).replaceAll(" ", "0");
	}
	
	public String doLeftPadding2(String bin, int x) {
		
		return String.format("%0" + x + "d", Integer.parseInt(bin));
	}
}
