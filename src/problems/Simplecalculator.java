package problems;

import java.util.Scanner;

public class Simplecalculator {

	public static void main(String[] args) {
		// simple claculator
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		char ch=sc.next().charAt(0);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(ch)
		{
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case'*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		case'%':System.out.println(a%b);
		default:System.out.println("invalid input!");
		}

	}

}
