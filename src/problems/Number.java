package problems;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// number count
		
		
		Scanner sc=new Scanner(System.in);
		int p=0;
		int n=0;
		int z=0;
		System.out.println("Enter the numbers=");
		int nl=sc.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			int c=sc.nextInt();
			if(c==0)
			{
				z++;
			}
			else if(c>0)
			{
				p++;
			}
			else 
			{
			n++;	
			}
		}
		
		System.out.println("Number of positive numbers="+p);
		System.out.println("Number of negative numbers="+n);
		System.out.println("Number of zero values="+z);
		
	}

}
