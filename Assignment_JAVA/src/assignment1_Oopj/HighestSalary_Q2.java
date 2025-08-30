package assignment1_Oopj;

import java.util.Scanner;

public class HighestSalary_Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Salary for company 1: ");
		int comp1 = sc.nextInt();
		System.out.print("Enter Salary for company 2: ");
		int comp2 = sc.nextInt();
		System.out.print("Enter Salary for company 3: ");
		int comp3 = sc.nextInt();
		
//		String result1 = (comp1>=comp2 && comp1>=comp3) ? "Company 1 offers the highest salary" :
//						 (comp2>=comp1 && comp2>=comp3) ? "Company 2 offers the highest salary" :
//						 (comp3>=comp1 && comp3>=comp2) ? "Company 3 offers the highest salary" : "";	 
//		 System.out.println(result1);
		
		if(comp1>=comp2 && comp1>=comp3) {
			System.out.println("Company 1 offers the highest salary" + comp1);
		}
		else if(comp2>=comp1 && comp2>=comp3) {
			System.out.println("Company 2 offers highest salary" + comp2);
		}
		else if(comp3>=comp1 && comp3>=comp2) {
			System.out.println("Company 3 offers highest salary :" + comp3);
		}
		sc.close();

	}

}
