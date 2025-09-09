package assignment4_Oopj;

import java.util.Scanner;

class Age{
	
	public void getAge() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter age : ");
		
		String age = scanner.next().toString();	
		
		try {
			int num = Integer.parseInt(age);
			
			if(num > 0 ) {
				System.out.println("your age is : " + num);
			}else {
				System.out.println("Invalid age....!");
			}
		}
		catch(Exception e) {
			System.out.println("Invalid number format"+e);
		}
		 
		 
	}
}
public class AgeInput_Q3 {

	public static void main(String[] args) {
		
		Age age = new Age();
		age.getAge();
	}

}
