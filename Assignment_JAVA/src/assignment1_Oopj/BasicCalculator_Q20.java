package assignment1_Oopj;

import java.util.Scanner;

public class BasicCalculator_Q20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 1st Number : ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter 2nd Number : ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Enter Operator(+ - * /)");
		
		char operator = scanner.next().charAt(0);
		
		if(operator == '+') {
			System.out.println("The sum of two number is : " + (num1+num2));
		}
		else if(operator == '-'){
			System.out.println("The substraction of two number is : " + (num1-num2));	
		}
		else if(operator == '*') {
			System.out.println("The multiplication of two number is : " + (num1 * num2 ));
		}
		else if(operator=='/') {
			System.out.println("The Division of two number is : " + (num1/num2));
		}
		else {
			System.out.println("Invalid Operator");
		}
		
		scanner.close();
	}

}
