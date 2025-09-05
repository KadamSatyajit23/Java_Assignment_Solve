package assignment3_Oopj;

class Employees{
	
	private int age;
	
	public void setAge(int age) {
		if(age >=18) {
			this.age = age;
		}
		else {
			System.out.println("Invalid age");
		}
	}
	public int getAge() {
		return age;
	}
}

public class AgeValidation {
	
	public static void main(String args[]) {
		
		Employees employees = new Employees();
		employees.setAge(19);
		System.out.println("age = " + employees.getAge());
	}
}
