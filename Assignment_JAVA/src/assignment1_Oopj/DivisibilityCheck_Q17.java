package assignment1_Oopj;

import java.util.Scanner;

public class DivisibilityCheck_Q17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = scanner.nextInt();
		
		if(num%2==0) {
			if(num%3==0) {
				if(num%5==0) {
					System.out.println("Divisible by 2");
					System.out.println("Divisible by 3");
					System.out.println("Divisible by 5");
				}
			}
		}
		else {
			System.out.println("Not divisible");
		}
		
		scanner.close();
	}
}
