package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner s = new Scanner(System.in);
		List<String> anagrams = new ArrayList<>();
		
		System.out.println("Type the word: ");
		
		String word = s.next();
		anagrams = getAnagrams(word);

		if(!anagrams.isEmpty()) {
		System.out.println("Anagrams found: ");

		for (String str : anagrams) {
			System.out.println(str);
		}
		}
		else {
			System.out.println("No anagrams found");
		}
	}

	public static List<String> getAnagrams(String str) throws FileNotFoundException {

		char[] strArr = str.toCharArray();
		Arrays.sort(strArr);

		List<String> anagrams = new ArrayList<>();
		Scanner s = new Scanner(new File("words-list.txt"));
		
		while (s.hasNextLine()) {

			String currentWord = s.next();
			if (!currentWord.isEmpty()) {
				char[] wordArray = currentWord.toCharArray();
				Arrays.sort(wordArray);

				if (String.valueOf(strArr).equals(String.valueOf(wordArray)))
					anagrams.add(currentWord);
			}
		}

		return anagrams;
	}
}
