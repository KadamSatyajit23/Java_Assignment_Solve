package assignment1_Oopj;

import java.util.Scanner;

public class DaysInMonth_Q19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Month Number : ");
		
		int num = scanner.nextInt();
		
		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Days");
			break;
		
		case 2:
			System.out.println("28 or 29 Days");
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days");
			break;
			
		default :
			System.out.println("Invalid Input...!");
		}
		
		scanner.close();
	}

}
