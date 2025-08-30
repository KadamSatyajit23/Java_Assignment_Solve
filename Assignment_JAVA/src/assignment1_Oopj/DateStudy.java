package assignment1_Oopj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateStudy {

	public static void main(String[] args) {
		
		Date  now = new Date();
		System.out.println(now);
		
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+(1)); //0-based index
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+(1));
		
		cal.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println("After 7 days" + cal.getTime());
		
		Date d1 = new Date();
		SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		System.out.println(s1.format(d1));
		
		Scanner scanner = new Scanner(System.in);
		int []arr = new int[5];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		
		for(int e : arr) {
			System.out.println(e);
		}
		scanner.close();
	}

}
