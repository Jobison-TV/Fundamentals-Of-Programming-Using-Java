package Array;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
			 Scanner s=new Scanner(System.in);
			 int n=s.nextInt();
			 String a[]=new String[n];
			 
			 for(int i=0;i<n;i++)
			 {
				 a[i]=s.next();
			 }
				 for(int i=0;i<n;i++)
				 {
					 for(int j=i+1;j<n;j++)
					 {
						
					 if(a[i]<a[j]) {
						 String temp;
						 temp=a[i];
						 a[i]=a[j];
						 a[j]=temp;
						if(a[i]==a[j]) {
									
									}
								 }
								 
							 }} 
							
						 }}

