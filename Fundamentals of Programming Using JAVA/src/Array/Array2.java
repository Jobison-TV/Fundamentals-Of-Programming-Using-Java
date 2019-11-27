package Array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		System.out.println("Enter a size:");
				 Scanner s=new Scanner(System.in);
				 int n=s.nextInt();
				 int a[]=new int[n];
				 
				 for(int i=0;i<n;i++)
				 {
					 a[i]=s.nextInt();
				 }
					 for(int i=0;i<n;i++)
					 {
						 for(int j=i+1;j<n;j++)
						 {
						 if(a[i]<a[j]) {
							 int temp;
							 temp=a[i];
							 a[i]=a[j];
							 a[j]=temp;
							if(a[i]==a[j]) {
								a[i]=n-1;
								System.out.println(n);
								
								
							}
						 }
						 
					 }} 
					
				 }}
