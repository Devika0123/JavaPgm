package stringpgm;

import java.util.Scanner;

public class Evenstring {

	public static void main(String[] args) {
		// Even string
		
		
		System.out.println("Enter a string value");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String[] words =s.split("");
		System.out.println("Words with even number of characters");
		for(String word:words)
		{
		 if(s.length()%2==0)
		{
			
		System.out.print(word);
			
		}
		

	}}
}


