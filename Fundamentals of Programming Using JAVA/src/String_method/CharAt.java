package String_method;

import java.util.Scanner;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println("enter the index number ");

		int index=s.nextInt();
		char c=str.charAt(index);
		System.out.println(c);

	}

}
