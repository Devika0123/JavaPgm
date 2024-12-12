package problems;

import java.util.Scanner;

public class Primenumscan {

	public static void main(String[] args) {
		// prime number
		
		Scanner sc  =new Scanner(System.in);
		int n=sc.nextInt();
		int num=n,count=0;
		if(num>1)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println	("Prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
		}
			

	}

}
;