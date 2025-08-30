package assignment1_Oopj;

import java.util.Scanner;

public class ExamAttendanceEligibility_Q10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter total class held : ");
		int totalClass = scanner.nextInt();
		
		System.out.print("Enter total class attend : ");
		int totalAttend = scanner.nextInt();
		
		double attendencePercentage = totalAttend * 100/totalClass;
		
		String result = (attendencePercentage >= 75) ? "Student is allowed to sit for the exam" : "Student not allowed to sit for the exam beacuse of attendance is less than 75%";
		System.out.println(result);
		
		scanner.close();

	}

}
