package assignment3_Oopj;

class BankAccount{
	private double balance;
	
	public void deposite(double amount) {
		
		if(amount > 0) {
			balance = balance + amount;
			System.out.println("Depostie amount : " + amount);
		}
		else {
			System.out.println("Deposite amount must be posite...!");
		}
	}
	
	public void withdraw(double amount) {
		
		if(amount >= 0) {
			if(amount <=balance) {
				balance = balance - amount;
				System.out.println("WithDrawn amount : " + amount);
			}
			else {
				System.out.println("Insuficient Balance");
			}
		}
		else {
			System.out.println("withdrawn amount must be positive");
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
}

public class BankAccountProtection_Q1 {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		
		bankAccount.deposite(6000);
		bankAccount.withdraw(000);
		
		System.out.println(bankAccount.getBalance());
	}

}
