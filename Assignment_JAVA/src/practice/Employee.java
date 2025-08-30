package practice;

public class Employee {

	private int empId;
	private String name;
	
	public void setEmpId(int empId) {
		if(empId <=0 ) {
			System.out.println("Invalid id");
		}
		else {
			this.empId =empId;
		}
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
	
		System.out.println("helloo");
		
		Employee employee = new Employee();
		
		employee.setEmpId(30);
		System.out.println(employee.getEmpId());
	}

}
