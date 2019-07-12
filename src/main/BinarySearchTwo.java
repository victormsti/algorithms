package main;

public class BinarySearchTwo {

	static int mid = 0;
	public static void main(String[] args) {

		int[] arr = { 1, 2, 18, 32, 65, 78, 89, 98, 115, 432, 567 };

		System.out.println("The index is : " + binarySearch(arr, 18));
	}

	public static int binarySearch(int[] a, int target) {
		
		//check thre array
		if(a == null || a.length ==0) return -1;
		else return binarySearchImpl(a, 0, a.length -1, target); // should return 6
	}

	public static int binarySearchImpl(int[] a, int min, int max, int target) {
		if (min > max) return -1;
		
//		mid = (max + min) >>> 1;
		mid = (max + min) / 2;
		if(a[mid] == target) return mid;
		else if(a[mid] > target) return binarySearchImpl(a, min, mid-1, target);
		else return binarySearchImpl(a, mid + 1, max, target);
	}
}
