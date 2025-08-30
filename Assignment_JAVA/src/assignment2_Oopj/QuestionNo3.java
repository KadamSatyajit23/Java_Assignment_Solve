package assignment2_Oopj;

class Books{
	
	private String title;
	private String author;
	private boolean issued;
	private static int totalIssuedBooks;
	
	 public Books(String title, String author, boolean issued) {
		this.title = title;
		this.author = author;
		this.issued = issued;
		
		if(issued == true) {
			totalIssuedBooks++;
		}
	}

	 public void setTitle(String title) {
		 this.title = title;
	 }
	 public String getTitle() {
		 return title;
	 }

	 public String getAuthor() {
		 return author;
	 }
	 public void setAuthor(String author) {
		 this.author = author;
	 }
	 
	 public boolean isIssued() {
		 return issued;
	 }
	 
	  public void setIssued(boolean issued) {
	        
	        if (!this.issued && issued) {
	            totalIssuedBooks++;
	        } else if (this.issued && !issued) {
	            totalIssuedBooks--;
	        }
	        this.issued = issued;
	    }
	 
	 public static void showTotalIssued() {
		 System.out.println("Total books issued : " + totalIssuedBooks);
	 }
	 
}

public class QuestionNo3 {
	
	public static void main(String[] args) {
		
		Books books = new Books("Harry Potter", "satyajit", true);
	
		System.out.println(books.getTitle());
		
		Books.showTotalIssued();
	}

}
