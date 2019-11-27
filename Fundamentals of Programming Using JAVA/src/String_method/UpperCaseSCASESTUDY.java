package String_method;

import java.util.Arrays;
import java.util.Scanner;

public class UpperCaseSCASESTUDY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		String s3=s.next();
		int f=0,i,j=0;
		String con=s1.concat(s2);
		char conc[]=con.toCharArray();
		Arrays.sort(conc);

		char s31[]=s3.toCharArray();
		Arrays.sort(s31);
		for( i=0;i<s3.length();i++)
		{
			for(j=0;j<con.length();j++)
			{
				
				if(s3.contentEquals(con)&&con.length()==s3.length())
				{
					f=1;
				}
				
				
			}
		}
		if(f==1) {
			
		
		System.out.println("YES");
		}
		else {
				System.out.println("NO");
				
		}

	}

}
