package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class CountPairs {

	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int t = sc.nextInt();

		for (int a = 0; a < t; a++) {
			int d = sc.nextInt();

			ArrayList<Integer> auxList = new ArrayList<Integer>();
			ArrayList<Integer> auxList2 = new ArrayList<Integer>();
			for (int i = 0; i < d; i++) {
				auxList.add(list.get(i));
				auxList2.add(i);
			}
			for(int j=0;j<auxList2.size();j++) {
				list.remove(j);
			}

			int size = auxList.size();
			for(int k=0;k<size;k++) {
				list.add(auxList.get(k));
			}
		}
		
		System.out.println(list.toString());
	}
}
