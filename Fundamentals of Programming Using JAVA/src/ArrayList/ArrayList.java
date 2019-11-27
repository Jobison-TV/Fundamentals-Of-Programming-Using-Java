package ArrayList;
import java.util.Scanner;
import java.util.*;

public class ArrayList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList list=new ArrayList();//ArrrayList class declartion
		//ArrayList<String>list=new ArrayList();
		//Arraylist<Integer> list =new ArrayList();
		for(int i=0;i<n;i++)
		{
			System.out.print(" enter the name");
			String name=s.next();
			System.out.println("enter the age");
			int age=s.nextInt();
			list.add(name);//add methed
			list.add(age);
		}
		Iterator itr=list.Iterator();//it is used to travers a elements one by one
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

	

}
