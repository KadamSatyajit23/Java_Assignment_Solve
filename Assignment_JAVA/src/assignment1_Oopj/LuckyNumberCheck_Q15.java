package assignment1_Oopj;

import java.util.Scanner;

public class LuckyNumberCheck_Q15 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 4 digit number : ");
		int num = scanner.nextInt();
		
		
		
		if(num < 1000 || num > 9999) {
			System.out.println("Enter valid number ");
		}else {
			
			int a = num /1000;      
	        int b = (num / 100) % 10;  
	        int c = (num / 10) % 10;   
	        int d = num % 10;  
	        
	        if((a+b == c+d)) {
	        	System.out.println("Lucky Number");
	        }
	        else {
				System.out.println("Not a lucky number");
			}
		}
		scanner.close();
	}

}
