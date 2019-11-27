package DATEandTIME;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int amount=0;
		 
		 
		LocalDateTime dt=LocalDateTime.now();
		

		System.out.println("Enter the name");
		String name=s.next();

		System.out.println("Enter the Address");
		String ad=s.next();

		System.out.println("Enter the number of Room");
		int room=s.nextInt();
		
		System.out.println("number person");
		int person=s.nextInt();
		if(room*3<person)
		{
		
			System.out.println("room not suuficient plz");
			int rooms1=person/3;
			int rooms2=person%3;
			
			System.out.println("add more rooms");
			int room1=s.nextInt();
			int rooms=room+room1;
			if()
		}
		
		
		System.out.println("AC or Non-AC(y/n)?");
		char ac=s.next().charAt(0);
		s.nextLine();
		System.out.println("booking day(format 2017-11-20)");
		String start =s.nextLine();// format 2017-11-20
		 System.out.println("check out day(format 2017-11-20)");

		
	    String end = s.nextLine();
	    LocalDate ds = LocalDate.parse(start);
	    LocalDate de = LocalDate.parse(end);
	    long total = ChronoUnit.DAYS.between(ds,de);
	   
		 	//int cd=s.nextInt();
		//Calendar calendar=Calendar.getInstance();
		//calendar.add(Calendar.DATE, cd);
		System.out.println("\nREG-Details: \n");
		System.out.println("name: "+name);
		System.out.println("Address :"+ad);
		System.out.println("No.of rooms :"+room);
		System.out.println("No.of Guest :"+person);
		System.out.println("booking Date: "+ds);
		System.out.println("CheckOut Date: " + de);
		System.out.println("No of Days: "+total);
		if(ac=='y')
		{ 
			amount=1150*room;
			
			System.out.println("Amount : "+amount);
			
		}
		else {
			amount=room*500;
			System.out.println("Total Amount: "+amount);
		}
		
	}}