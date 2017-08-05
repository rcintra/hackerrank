package introdution;

import java.util.Calendar;
import java.util.Scanner;

public class DateAndTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.valueOf(year), Integer.valueOf(month)-1, Integer.valueOf(day));
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			System.out.println("SUNDAY");
			break;
		case Calendar.MONDAY:
			System.out.println("MONDAY");
			break;
		case Calendar.TUESDAY:
			System.out.println("TUESDAY");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("WEDNESDAY");
			break;
		case Calendar.THURSDAY:
			System.out.println("THURSDAY");
			break;
		case Calendar.FRIDAY:
			System.out.println("FRIDAY");
			break;
		case Calendar.SATURDAY:
			System.out.println("SATURDAY");
			break;					
		default:
			break;
		}
	}
}
