package assignment3_Oopj;


class Account{
	double accountNo;
	double balance;
	
	public Account(double accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public void display() {
		System.out.println(accountNo + balance);
	}
	
}

class SavingAccount extends Account{
	String interestRate;
	
	public SavingAccount(String interestRate, double accountNo, double balance) {
		super(accountNo, balance);
		this.interestRate = interestRate;
	}
	@Override
	public void display() {
		System.out.println("Saving->" + "AccountNo=" + accountNo + ", Balance="+balance + ", interestRate=" + interestRate);
	}
}

class CurrentAccount extends Account{
	double overDraftLimit;
	
	public CurrentAccount(double accountNo, double balance, double overDraftLimit) {
		super(accountNo, balance);
		this.overDraftLimit = overDraftLimit;
	}
	
	@Override
	public void display() {
		System.out.println("Current->" + "AccountNo=" + accountNo + ", Balance="+balance + ", Overdraft=" + overDraftLimit);
	}
}
public class BankAccountType_Q11 {

	public static void main(String[] args) {
		
		SavingAccount savingAccount = new SavingAccount("5%",101, 40000);
		savingAccount.display();
		
		CurrentAccount currentAccount = new CurrentAccount(102, 20000, 1000);
		currentAccount.display();
		

	}

}
