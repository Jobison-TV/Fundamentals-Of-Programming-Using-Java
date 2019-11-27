
package String_method;
import java.util.*;
public class Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j;
		String str="qwertyuiop asdfghjkl; zxcvbnm,./";
		
		
		char ch[]=str.toCharArray();
		System.out.println("Enter L/R");
		char in=s.next().charAt(0);
		
		 String str1=s.next();
		 char ch1[]=str1.toCharArray();
		 	int l=str1.length();
		 	

		 for( i=0;i<l;i++)
		 {
				for(j=0;j<str.length();j++)
				{
					
				
				 if(ch1[i]==ch[j]&&in=='R')
				 {
					 System.out.print(ch[j-1]);
				 }
				 if(ch1[i]==ch[j]&&in=='L')
				 {
					 System.out.print(ch[j+1]);

				 }
				}}
		 
	
	
	
	}}