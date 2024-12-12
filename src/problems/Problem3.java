package problems;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3=sc.nextInt();
		if(num1<num2& num2<num3) 
		{
			System.out.println("Increasing");
		}
		else if
		(num1>num2&num2>num3) 
		{
			System.out.println("Decreasing");	
		}
		else 
		{
			System.out.println("neither increasing nor decreasing");	
		}

	}

}
