package assignment3_Oopj;



class Staff{
	String name;
	int salary;
	
	public Staff(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(name + salary);
	}
}
class TeachingStaff extends Staff{
	String subject;
	
	public TeachingStaff(String name, int salary, String subject) {
		super(name, salary);
		
		this.subject = subject;
	}
	@Override
	public void display() {
		System.out.println("Teaching-> Name="+ name +"," + " Salary="+salary+", Subject=" + subject);
	}
}
class NonTeachingStaff extends Staff{
	String department;
	
	public NonTeachingStaff(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	@Override
	public void display() {
		System.out.println("NonTeaching-> Name="+ name +"," + " Salary="+salary+", Department=" + department);
	}
}
public class AcademicStaff_Q10 {

	public static void main(String[] args) {
		
		TeachingStaff teachingStaff = new TeachingStaff("Anita", 50000, "Maths");
		teachingStaff.display();
		
		NonTeachingStaff nonTeachingStaff = new NonTeachingStaff("Ramesh",40000, "Admin");
		nonTeachingStaff.display();
	}

}
