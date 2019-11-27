package Array;

import java.util.Scanner;

public class Indux_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0,j=0,k=0;
		int n1=n*3+3;
		int a[]=new int[n1];
		//0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8

		while(i<n1)
		{
			if(i%2!=0)
			{
				a[i]=j;
				j=j+1;
			}
			else
			{
				a[i]=k;
				k=k+2;
			}
			i++;
		}
			System.out.print(a[n-1]);

			
		}

	}


