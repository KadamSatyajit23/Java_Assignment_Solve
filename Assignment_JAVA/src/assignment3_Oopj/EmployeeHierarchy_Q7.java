package assignment3_Oopj;

class Employee{
	String name;
	int basicSalary;
	
	public Employee(String name, int basicSalary) {
		if(name == null || name.trim().length()<3 || basicSalary <=0) {
			System.out.println("Invalid Name OR Salary");
		}
		else {
			this.name = name;
			this.basicSalary = basicSalary;
		}
	}
	
	public int netSalary() {
		return basicSalary;
	}
}

class RegularEmployee extends Employee{

	public RegularEmployee(String name, int basicSalary) {
		super(name, basicSalary);
		
	}
	
	@Override
	public int netSalary() {

		int allowance = basicSalary * 10/100;	
		return basicSalary + allowance;
	}		
}

class ContractEmployees extends Employee{

	public ContractEmployees(String name, int basicSalary) {
		super(name, basicSalary);
	}
	
	@Override
	public int netSalary() {
		
		int allowance = basicSalary * 5/100;
		
		return basicSalary + allowance;
	}
}

public class EmployeeHierarchy_Q7 {

	public static void main(String[] args) {
		
		RegularEmployee regularEmployee = new RegularEmployee("Rahul", 20000);
		
		System.out.println("Rahul netSalary = " + regularEmployee.netSalary());
		
		ContractEmployees contractEmployees = new ContractEmployees("Riya", 15000);
		System.out.println("Riya netSalary = " + contractEmployees.netSalary());
		
	}

}
