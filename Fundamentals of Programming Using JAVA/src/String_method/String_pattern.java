package String_method;

import java.util.Scanner;

public class String_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		String str3=s.nextLine();
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();

		char c3[]=str3.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
			if(c1[i]=='a'||c1[i]=='A'||c1[i]=='e'||c1[i]=='E'||c1[i]=='u'||c1[i]=='U'||c1[i]=='i'||c1[i]=='I'||c1[i]=='o'||c1[i]=='O')
			{
				c1[i]='$';
				
			}
			
			
			System.out.print(c1[i]);
		}
		for(int i=0;i<str2.length();i++)
		{
			if(c2[i]=='a'||c2[i]=='A'||c2[i]=='e'||c2[i]=='E'||c2[i]=='u'||c2[i]=='U'||c2[i]=='i'||c2[i]=='I'||c2[i]=='o'||c2[i]=='O')
			{
			
			c2[i]=c2[i];
			} 
			else if(c2[i]>='a'&&c2[i]<='z'||c2[i]>='A'&&c2[i]<='Z')
			{
				c2[i]='#';
			}
		
			System.out.print(c2[i]);
		}
		for(int i=0;i<str3.length();i++)
		{
		if(c3[i]>96&&c3[i]<123)
		{
			c3[i]=(char)(c3[i]-32);
		}
		System.out.print(c3[i]);

		}
	}

}
