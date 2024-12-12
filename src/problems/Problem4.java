package problems;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		//Java program to find largest element in an array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in the array:");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
		arr[i]	=sc.nextInt();
		}
		int largest =arr[0];
		for(int i=1;i<n;i++) 
		{
			if(arr[i]>largest)
			{
			largest= arr[i]	;
			}
		}
		System.out.println("The largestelement in the array is :"+ largest);

	}

}
