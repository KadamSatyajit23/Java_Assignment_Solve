package assignment1_Oopj;

import java.util.Scanner;

public class GreatestOfTwo_Q1 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter score for Test1: ");
		int test1 = scanner.nextInt();
		
		System.out.print("Enter score for Test2: ");
		int test2 = scanner.nextInt();
		
		if(test1 > test2) {
			System.out.println("Test1 has higher score");
		}
		else if(test2 > test1) {
			System.out.println("Test2 has higher score");
		}
		else if(test1 == test2) {
			System.out.println("Test1 & Test2 score is equal");
		}
		scanner.close();
	}
}
