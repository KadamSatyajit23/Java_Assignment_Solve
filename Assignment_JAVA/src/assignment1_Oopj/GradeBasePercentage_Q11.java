package assignment1_Oopj;

import java.util.Scanner;

public class GradeBasePercentage_Q11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		float percentage;
		
		while(true) {
			System.out.print("Enter Percentage : ");
			percentage = scanner.nextFloat();
			
			if(percentage > 0 && percentage <= 100) {
				break;
			}
			else {
				System.out.println("Enter valid percentage");
			}
		}
		System.out.println(percentage);
		
		if(percentage >= 90) {
			System.out.println("Grade A+");
		}
		else if(percentage > 75 && percentage < 90) {
			System.out.println("Grade A");
		}
		else if(percentage > 65 && percentage < 76) {
			System.out.println("Grade B+");
		}
		else if(percentage > 50 && percentage < 66) {
			System.out.println("Grade B");
		}
		else if(percentage > 34 && percentage < 51) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}
		
		scanner.close();
	}

}
