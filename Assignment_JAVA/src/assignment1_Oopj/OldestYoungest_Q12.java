package assignment1_Oopj;
import java.util.Scanner;

public class OldestYoungest_Q12 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter your age : ");
		int yourAge = scanner.nextInt();
		
		System.out.print("Enter friend1 age : ");
		int friend1Age = scanner.nextInt();
		
		System.out.print("Enter friend2 age : ");
		int friend2Age = scanner.nextInt();
		
		// For check Valid age
		if(yourAge<=0 || friend1Age<=0 || friend2Age<=0) {
			System.out.println("Enter valid age");
		}
		
		//for check oldest age
		if(yourAge>= friend1Age && yourAge>= friend2Age) {
			System.out.println("Oldest : you - " + yourAge);
		}
		else if (friend1Age>=yourAge && friend1Age>= friend2Age) {
			System.out.println("Oldest : Friend1 - " + friend1Age);
		}
		else {
			System.out.println("Oldest : Friend2 - " + friend2Age);
		}
		
		//for check youngest age
		if(yourAge<= friend1Age && yourAge<= friend2Age) {
			System.out.println("Youngest : you - " + yourAge);
		}
		else if (friend1Age<=yourAge && friend1Age<= friend2Age) {
			System.out.println("Youngest : Friend1 - " + friend1Age);
		}
		else {
			System.out.println("Youngest : Friend2 - " + friend2Age);
		}
		
	scanner.close();
	}
}
