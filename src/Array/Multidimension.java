package Array;

import java.util.Scanner;

public class Multidimension {

	public static void main(String[] args) {
		// Multidimension array
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		
		
		int[][]arr=new int[3][2];
		
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<2;j++)
		{
			arr[i][j]=sc.nextInt();
		}
		}
		System.out.println("Entered numbers are:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
