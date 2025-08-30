package assignment1_Oopj;

import java.util.Scanner;

public class ShopDiscountCalculation_Q8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Total purchase amount : ");
		
		float amount = scanner.nextFloat();
		int discount = 10;
		float discountAmount;
		float finalAmount;
		
		if(amount >=1000) {
			discountAmount = amount * discount/100;
			finalAmount = amount - discountAmount;
			
			System.out.println("Final cost after discount : " + finalAmount);	
		}
		else {
			System.out.println("Final cost : " + amount);
		}
		
		scanner.close();
		

	}

}
