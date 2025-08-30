package assignment1_Oopj;

import java.util.Scanner;

public class EmployeeBonusEligibility_Q9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter salary : ");
		int salary = scanner.nextInt();
		
		System.out.print("Enter years of service : ");
		float year = scanner.nextFloat();
		
		int bonus = 5;
		float bonusAmount;
		
		if(year > 5) {
			bonusAmount = salary * bonus/100;
			
			System.out.println(bonusAmount);
		}
		else {
			System.out.println("Your service is less than 5 years ");
		}
		
		scanner.close();
		
		
		
	}

}
