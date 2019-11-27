package DATEandTIME;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DATEandTIME {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Today date");
		LocalDate date=LocalDate.now();//for system date
		System.out.println(date);

		
		System.out.println("Today time");
		LocalTime time=LocalTime.now();//for System time
		System.out.println(time);
		
		
		System.out.println("Today date and time");
		LocalDateTime datetime=LocalDateTime.now();//local time and date
		System.out.println(datetime);


		System.out.println("Formatted date and time");
	    DateTimeFormatter format=DateTimeFormatter.ofPattern("E, MMM YYYY : dd || hh : mm : ss "); 
	    String formatDate=datetime.format(format);
		System.out.println(formatDate);

		
		Calendar calendar=Calendar.getInstance();
		System.out.println("Present Year->"+calendar.get(Calendar.YEAR));
		System.out.println("Present MONTH->"+calendar.get(Calendar.MONTH));
		System.out.println("The current date is : " + calendar.getTime());
	    calendar.add(Calendar.DATE, -7);
	    System.out.println("7 days ago: " + calendar.getTime());
	   calendar.add(Calendar.MONTH, 10);
	   System.out.println("10 months later: " + calendar.getTime());
	    calendar.add(Calendar.YEAR, 10);
	    System.out.println("10 years later: " + calendar.getTime());
	    }
	}