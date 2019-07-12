package main;

public class CircularArray {
	public static void print(char a[], int n, int ind) {

		// Create an auxiliary array
		// of twice size.
		char[] b = new char[(2 * n)];

		// Copy a[] to b[] two times
		for (int i = 0; i < n; i++)
			b[i] = b[n + i] = a[i];
		// print from ind-th index to
		// (n+i)th index.
		for (int i = ind; i < n + ind; i++)
			System.out.print(b[i] + " ");
	}

	// driver function
	public static void main(String argc[]) {
		char[] a = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };
		int n = 6;
		print(a, n, 3);

		// find less element
		// find elements behind
		int[] arr = { 8, 9, 10, 2, 5, 6 };
		int minimal = 0;
		int ind = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i == 0)
				minimal = arr[i];

			if (arr[i] < minimal) {
				minimal = arr[i];
					ind = i;
				}
		}
		
		System.out.println("The array is rotated " + (arr.length - (arr.length - ind)) + " times");
		
		System.out.println(19 >>>1);
	}
}
