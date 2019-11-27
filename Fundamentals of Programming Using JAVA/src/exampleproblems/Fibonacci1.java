package exampleproblems;
import java.util.Scanner;
public class Fibonacci1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int a=0;
		int b=1,sum=0,flag=0;
		if(n==a||n==b)
		{
			System.out.println("YES");
		}
		else
		{
			while(sum<=n)
			{
			sum=a+b;
			if(sum==n)
			{
				flag=1;
			}
		a=b;
		b=sum;
			
		}
		}
		if(flag==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
