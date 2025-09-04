package assignment3_Oopj;

class Student{
	private int marks;
	
	public void setMarks(int marks) {
		
		if(marks > 0 && marks <=100) {
			this.marks = marks;
		}
		else {
			System.out.println("Invalid marks");
		}
	}
	
	public int getMarks() {
		return marks;
	}
}

public class StudentMarks_Q2 {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setMarks(175);
		
		System.out.println("Marks = " + student.getMarks());
	}

}
