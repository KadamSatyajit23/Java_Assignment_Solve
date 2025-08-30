package assignment1_Oopj;

import java.util.Scanner;

public class VowelOrConsonantCheck_Q16 {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		
		if(str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o'|| str.charAt(0) == 'u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonent");
		}
	
		scanner.close();
	}
}
