package problems;

public class Primenum {

	public static void main(String[] args) {
		// prime number
		int num=10;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
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
			else
			{
				System.out.println("Not a Prime number");
			}
		}

	}



