package assignment1_Oopj;

import java.util.Scanner;

public class ExamPassFail_Q7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter marks between 0 to 100: ");
		int marks = scanner.nextInt();
		
		String result = (marks < 0 || marks > 100) ? "Enter valid marks..":
			(marks >= 35)? "Student has passed" :
			"Student failed";
		
		System.out.println(result);
		
		scanner.close();
	}

}
