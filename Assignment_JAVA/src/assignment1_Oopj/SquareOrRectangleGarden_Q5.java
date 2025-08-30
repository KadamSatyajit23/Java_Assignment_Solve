package assignment1_Oopj;

import java.util.Scanner;

public class SquareOrRectangleGarden_Q5 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length : ");
		float lenght = scanner.nextFloat();
		
		System.out.print("Enter breadth : ");
		float breadth = scanner.nextFloat();
		
		String result = (lenght == breadth) ? "Square garden" : "Rectangle garden";
		System.out.println(result);
		
		scanner.close();
	}
}
