package exampleproblems;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int flag=1;int i;
for(i=2;i<=n/2;i++)
{
	if(n%i!=0) {
		flag=1;
		}
	else {
		flag=0;
		break;
	}
}
if(flag==1)
	System.out.println("PRIME");
else
	System.out.println("NOT PRIME");
	}

}
