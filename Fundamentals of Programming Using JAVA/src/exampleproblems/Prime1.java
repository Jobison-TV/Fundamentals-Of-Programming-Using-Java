package exampleproblems;
import java.util.Scanner;
public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n1=s.nextInt();
System.out.println("enter the number");
int n2=s.nextInt();
int i,j,c=0;
while(n1<=n2)
	{
	for(j=2;j<=n1/2;j++)
	{
		if(n1%j==0) {
			c=1;
			
		}
		else
			c=0;
			
	}
	if(c==0)
		System.out.println(n1);
	n1++;
}
}
}