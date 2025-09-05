package practice;

class Calculator{
	int a;
	int b;
	
	public Calculator() {//Default Constructor
		
	}
	public Calculator(int a) { 
		this.a = a;
	}
	
	public Calculator(int a,int b) {
		this.a = a;
		this.b = b;
		
		System.out.println(a+b);
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(10,20);
		
		System.out.println(calculator);
		System.out.println("Welocome...");
	
		

	}

}
