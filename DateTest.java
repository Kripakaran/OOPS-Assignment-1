package DateAndTime;
import java.util.*;
public class DateTest {
	
     public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		Date a = new Date();
		System.out.println("Enter the day : ");
		int date = input.nextInt();
		System.out.println("Enter the month : ");
		int month = input.nextInt();
		System.out.println("Enter the year : ");
		int year = input.nextInt();
		input.close();
		a.setDay(date);
		a.setMonth(month);
		a.setYear(year);
		
		a.displayDate();
		System.out.println("Program done by P.Kripakaran(Reg No:2015103558)");
	}
}
