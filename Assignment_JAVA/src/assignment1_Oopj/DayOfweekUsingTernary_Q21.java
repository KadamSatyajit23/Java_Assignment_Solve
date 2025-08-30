package assignment1_Oopj;

import java.util.Scanner;

public class DayOfweekUsingTernary_Q21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Day number: ");
		int num = scanner.nextInt();
		
		if(num<=0 || num>7) {
			System.out.println("invalid input");
		}
		
			String result = (num == 1)?"Day is Monday":
							(num == 2)?"Day is Tuesday":
							(num == 3)?"Day is Wednesday":
							(num == 4)?"Day is Thrusday":
							(num == 5)?"Day is Friday":
							(num == 6)?"Day is Saturday":
							(num == 7)?"Day is Sunday":"";
			
			System.out.println(result);
			
			scanner.close();
		
	}

}
