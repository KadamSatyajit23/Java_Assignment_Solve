package assignment1_Oopj;

import java.util.Scanner;

public class BankTransactionCheck_Q3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter transaction amount : ");
		
		int amount = scanner.nextInt();
		
		String result = (amount > 0) ? "Deposit transaction" : "Withdrawal transaction";
		System.out.println(result);
		
		scanner.close();
	}
}
