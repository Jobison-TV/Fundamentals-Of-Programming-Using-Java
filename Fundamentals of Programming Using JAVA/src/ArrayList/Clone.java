package ArrayList;

import java.util.Iterator;
import java.util.Scanner;

public class Clone {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
		ArrayList list=new ArrayList();
		for(int i=0;i<n;i++)
		{

			System.out.print(" enter the name");
			String name=s.next();
			System.out.println("enter the age");
			int age=s.nextInt();
			list.add(name);//add methed
			list.add(age);
		}
		ArrayList list1=(ArrayList) list.clone();
		System.out.println("clone value"+list1.get(0));
		list1.remove(0);
		System.out.println(list1.get(0));
		System.out.println("list one value");
		
		Iterator itr=list.iterator();//it is used to travers a elements one by one
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		}
		

	}

}
