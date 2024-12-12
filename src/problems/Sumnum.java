package problems;

import java.util.Scanner;

public class Sumnum {

	public static void main(String[] args) {
		
		int a,b,c,sum;
		char choice;
		
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("Enter first number");
			a=sc.nextInt();
			System.out.println("Enter second number");
			b=sc.nextInt();
			sum=a+b;
			System.out.println("The sum is"+sum);
		
		
		System.out.println("Do you want to add another numbers?(y/n)");
		choice=sc.next().charAt(0);
		}
		while(choice=='y'|| choice=='y');
		sc.close();
	}
}
	

		
		
		
		
		
		
		
		
	

