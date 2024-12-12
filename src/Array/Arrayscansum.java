package Array;

import java.util.Scanner;

public class Arrayscansum {

	public static void main(String[] args) {
		// 
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size")	;
		int arraysize=sc.nextInt();
		int sum=0;
		
		System.out.println("enter the number");
		int[] arr=new int[arraysize];
		for(int i=0;i<arraysize;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum of entered number="+sum);
		System.out.println("Average of given number="+sum/arraysize);

		

	}

}
