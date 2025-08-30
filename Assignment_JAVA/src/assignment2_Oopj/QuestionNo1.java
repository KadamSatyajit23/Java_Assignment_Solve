package assignment2_Oopj;

class TeaCup{
	private String teaType;
	private static int totalCups;
	
	public TeaCup(String teaType) {
		this.teaType = teaType;
		totalCups++;
	}
	
	public String getTeaType() {
		return teaType;
	}
	
	public static void showTotalCups() {
		System.out.println("Total Cups made" + totalCups);
	}
}

public class QuestionNo1 {

	public static void main(String[] args) {
		
		TeaCup teaCup1 = new TeaCup("Masala tea");
		TeaCup teaCup2 = new TeaCup("Ginger tea");
		TeaCup teaCup3 = new TeaCup("Green tea");
		
		System.out.println(teaCup1.getTeaType());
		System.out.println(teaCup2.getTeaType());
		System.out.println(teaCup3.getTeaType());
		
		TeaCup.showTotalCups();
		

	}

}
