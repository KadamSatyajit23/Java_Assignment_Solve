package assignment3_Oopj;

abstract class Payment{
	abstract void pay();
}

class CreditCardPayment extends Payment{
	
	int cardNumber;
	double balance;
	
	public CreditCardPayment(int cardNumber, double balance) {
		this.cardNumber = cardNumber;
		this.balance = balance;
	}
	
	@Override
	public void pay() {
		System.out.println("Payment via Credit Card-> " + cardNumber + " -> Rs." + balance +" Paid");
	}
}

class UpiPayment extends Payment{
	
	String upiId;
	double amount;
	
	public UpiPayment(String upiId, double amount) {
		this.upiId = upiId;
		this.amount = amount;
	}
	
	@Override
	public void pay() {
		System.out.println("Payment via UPI-> " + upiId + " -> Rs." + amount +" Paid");
	}
	
}

public class PaymentSystem_Q12 {

	public static void main(String[] args) {
		
		CreditCardPayment creditCardPayment = new CreditCardPayment(1234567, 5000);
		creditCardPayment.pay();
		
		UpiPayment upiPayment = new UpiPayment("rahul@upi", 2000);
		upiPayment.pay();

	}

}
