package assignment1_Oopj;

import java.util.Scanner;

public class Reverse4DigitNumber_Q14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 4 digit number : ");
		int num = scanner.nextInt();
		
		
		
		if(num < 1000 || num > 9999) {
			System.out.println("Enter valid number ");
		}else {
			
			int reverse = 0;
			
			while(num != 0) {
				
				int digit = num % 10; //for last number
				reverse = reverse * 10 + digit; //update digit
				
				num = num/10; //remove last digit
			}
			
			System.out.println(reverse);
		}
		
		scanner.close();
	}

}
