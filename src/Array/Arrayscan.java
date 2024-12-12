package Array;

import java.util.Scanner;

public class Arrayscan {

	public static void main(String[] args) {
		// Array using scannerclass
		int[]arr=new int[3];
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=2;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered number are");
		for (int i=0;i<=2;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
