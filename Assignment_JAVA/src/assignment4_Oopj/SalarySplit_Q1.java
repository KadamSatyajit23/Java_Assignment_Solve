package assignment4_Oopj;

import java.util.Scanner;

class Department{
	
	static Scanner scanner = new Scanner(System.in);
	
	 public static void bonusAmount() {
		System.out.print("Enter Bounus amount :");
		
		int amount = scanner.nextInt();
		
		System.out.print("Enter Employees : ");
		
		int employees = scanner.nextInt();
		
		try {
			if(employees <=0) {
				
				throw new ArithmeticException("employeee must be greater than 0");		
			}
			else {
				int result = amount/employees;
				System.out.println("per employee amount is : " + result);
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
	}
}
public class SalarySplit_Q1 {

	public static void main(String[] args) {
		
		Department.bonusAmount();
	}

}
