package String_method;

import java.util.Scanner;

public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("employee name");
		s.append("\nName->"+sc.next());
		
		System.out.println("department");
		s.append("\nDepartment->"+sc.next());
		
		System.out.println("age");
		s.append("\nAge->"+sc.next());
		
		System.out.println("Salary");
		s.append("\nsalary->"+sc.next()+"\n");		
		

		System.out.println(s);

		

		}

}