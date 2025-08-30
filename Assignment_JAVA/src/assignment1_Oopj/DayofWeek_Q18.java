package assignment1_Oopj;

import java.util.Scanner;

public class DayofWeek_Q18 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int input = scanner.nextInt();
		
		switch(input) {
			
			case 1:
				System.out.println("Day is Monday");
				break;
			case 2:
				System.out.println("Day is Tuesday");
				break;
			case 3:
				System.out.println("Day is Wednesday");
				break;
			case 4:
				System.out.println("Day is Thrusday");
				break;
			case 5:
				System.out.println("Day is Friday");
				break;
			case 6:
				System.out.println("Day is Saturday");
				break;
			case 7: 
				System.out.println("Day is Sunday");
				break;
			default :
				System.out.println("Invalid Input....!");
		}
		
		scanner.close();
	}
}
