package stringpgm;

import java.util.Scanner;

public class Palindromstring {

	public static void main(String[] args) {
		// Palindrome or not
		
		System.out.println("Enter a string value"); //hello
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for (int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i); //o //ol //olle//olleh
		}
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("Entered string is palindrome");
		}
		else
		{
			System.out.println("Entered string is not a palindrome");
		}

	}

}
