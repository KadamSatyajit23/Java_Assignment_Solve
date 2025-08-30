package assignment1_Oopj;

import java.util.Scanner;

public class EvenOddLockerNumber_Q4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter locker number: ");
		int num = scanner.nextInt();
		
		String result = (num%2 == 0)  ? "Even locker number" : "Odd locker number";
		System.out.println(result);
		
		scanner.close();
	}

}
