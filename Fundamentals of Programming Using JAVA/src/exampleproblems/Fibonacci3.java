package exampleproblems;
import java.util.Scanner;
public class Fibonacci3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT");
		int l=s.nextInt();
		int a=0;
		int b=1;
		int arr[]=new int[25];
		int i=0,sum=0;
		arr[i]=a;
		arr[i+1]=b;
		for(i=0;i<l;i++)
		{
			sum=a+b;
			arr[i]=sum;
			a=b;
			b=sum;
		}
	
		System.out.println(arr[l-2]);

	}

}
