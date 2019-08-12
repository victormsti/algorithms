package main;

public class TruncateString {

	public static void main(String[] args) {

	}

	public String truncateAInFristTwoPositions(String str) {
		if (str.length() <= 2)
			return null;

		String twoFirst = str.substring(0, 2);
		String other = str.substring(2, str.length());
		String newString = twoFirst.replace("A", "");

		return newString + other;
	}

	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);

	}
}
