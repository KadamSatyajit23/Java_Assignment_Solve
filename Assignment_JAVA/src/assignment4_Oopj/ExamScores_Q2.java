package assignment4_Oopj;

import java.util.Scanner;

class GradeBook{
	
	public void getMarks() {
		
		int []marks = {75,80,20,30};
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter index number(Index start from zero) : ");
		int e = scanner.nextInt();
		
		if(e < marks.length && e>=0) {
			System.out.println(marks[e]);
		}
		else {
			System.out.println("Invalid idex");
		}
		
		scanner.close();
	}

	
	
}
public class ExamScores_Q2 {

	public static void main(String[] args) {
		
		GradeBook gradeBook = new GradeBook();
		gradeBook.getMarks();

	}

}
