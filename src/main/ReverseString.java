package main;

public class ReverseString {

	public static void main(String[] args) {
		
		
		//---------------------------------------------------------------------------------
		//With append() method
		StringBuilder normalString = new StringBuilder("normalString");
		System.out.println("Before reverse: " + normalString);
		
		normalString.reverse();
		
		System.out.println("After reverse: " + normalString);
		
		
		String name = "Victor";
		
		System.out.println(name);
		StringBuilder reverseName = new StringBuilder();
		
		reverseName.append(name);
		reverseName.reverse();
		
		System.out.println(reverseName);
		
		//---------------------------------------------------------------------------------
		//Without append() method
		System.out.println("================");
		String nm = "Victor";
		System.out.println(nm);
		StringBuilder nwNmReverse = new StringBuilder();
		char[] nwNm = nm.toCharArray();
				
		for(int i = nwNm.length-1; i >= 0; i--) {
			nwNmReverse.append(nwNm[i]);
		}
		
		System.out.println(nwNmReverse);
	}

}
