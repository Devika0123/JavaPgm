package problems;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci series
		int i=1;
		int n=25;
		int firstterm=0;
		int secondterm=1;
		
		
		
		while(i<=n)
		{
			System.out.print(firstterm + ",");
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			i++;
		}


	}

}
