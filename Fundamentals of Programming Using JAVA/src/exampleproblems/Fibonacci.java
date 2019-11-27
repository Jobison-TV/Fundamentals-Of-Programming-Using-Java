package exampleproblems;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("ente the number");
int n=s.nextInt();
int a=0;
int b=1;
int sum=0;
if(n==1) { 
	System.out.println(a);
    
}

else if(n==2) {
	System.out.println(a);
	System.out.println(b);
}
else
{
	System.out.println(a);
	System.out.println(b);
	while(n>2)
	{
	sum=b+a;
	System.out.println(sum);
	a=b;
	b=sum;
	n--;
	}
	
}

	}

}
