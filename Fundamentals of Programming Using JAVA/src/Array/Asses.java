package Array;
import java.util.Arrays;
import java.util.Scanner;

class Main
{
  public static void main(String [] args)
  {
    Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	 
	  String a[]=new String[n];
	  for(int i=1;i<=n;i++)
	  {
		  a[i]=s.next();
	  }
	  Arrays.sort(a);
	  System.out.println(a);
	  
  }
}