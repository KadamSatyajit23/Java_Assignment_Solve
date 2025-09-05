package assignment3_Oopj;


class Books{
	private int copiesAvilable;
	
	
	public void setCopies(int copiesAvilable) {
		this.copiesAvilable = copiesAvilable;
	}
	
	
	void addCopies(int n) {
		copiesAvilable += n; //copiesAvilabel = copiesAvilbale + n
	}
	
	void removeCopies(int n){
		copiesAvilable -= n; //copiesAvilabel = copiesAvilbale - n
	}
	
	public int getCopies() {
		return copiesAvilable;
	}
}
public class LibraryBookAvilability_Q4 {

	public static void main(String[] args) {
		
		Books books = new Books();
		
		books.addCopies(3);
		books.removeCopies(1);
		
		System.out.println("Avilabel Copies : " + books.getCopies());

	}

}
