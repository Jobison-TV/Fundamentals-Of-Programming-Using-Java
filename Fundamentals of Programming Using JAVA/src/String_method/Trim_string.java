package String_method;

import java.util.Scanner;

public class Trim_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.next();
		

		int l=str.length();
		System.out.println("length of the string "+l);
		char c=str.charAt(1);
		System.out.println(c);
			System.out.println(str.substring(1,3));
			System.out.println(str.startsWith("the"));
		

		System.out.println(str.indexOf(1));
		System.out.println("concat two string");
		String str3=s.next();
		System.out.println(str.concat(str3));
		System.out.println("replace->\n"+str.replace("the", "The"));
		System.out.println("lower and upper cases->");

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("string trim->");
		System.out.println(str.trim());
		System.out.println("String Split->");
		System.out.println(str.split(" "));

	}

}
