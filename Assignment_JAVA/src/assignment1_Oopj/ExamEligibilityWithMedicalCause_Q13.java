package assignment1_Oopj;

import java.util.Scanner;

public class ExamEligibilityWithMedicalCause_Q13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter class held : ");
		int heldClass = scanner.nextInt();
		
		System.out.print("Enter Classes attended : ");
		int attendClass = scanner.nextInt();
		
		float attendPercentage = attendClass * 100/heldClass;
		
		System.out.println(attendPercentage);
		
		//for check attendance percentage
		if(attendPercentage <= 75) {
			System.out.println("Your percentage is below 75 so you need to get permission");
			System.out.println("Enter Y/N or y/n");
			String ans = scanner.next();
			
			//nested if check to allow or not 
			if(ans.equals("Y") || ans.equals("y")) {
				System.out.println("Student is allowed to sit for the exam");
			}
			else {
				System.out.println("Student not allowed to sit for the exam");
			}
			
		}
		else {
			System.out.println("Student is allowed to sit for the exam");
		}
		
		scanner.close();
	}

}
