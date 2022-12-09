package JavaTest;

import java.util.Scanner;

public class checkVowel {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str = in.next();
		
		boolean isVowel = false;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == 'a' || c == 'A' || c == 'e' || c =='E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
				isVowel = true;
				break;
			}
		}
		
		if(isVowel) {
			System.out.println("Vowel is present in given string");
		}else {
			System.out.println("Vowel is not present in given string");

		}
	}

}
