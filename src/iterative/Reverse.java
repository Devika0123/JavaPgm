package iterative;

public class Reverse {

	public static void main(String[] args) {
		// Reverse a number
		
		int n=256;
		int rem;
		int rev=0;
		
		while(n>0)
		{
			rem=n%10;         //256%10=6;   25%10=5;   2
            rev=rev*10+rem;   //0*10+6=6    6*10+5=65  65*10+2=652
			n=n/10;           //256/10=25   25/10=2    2/10=0
		
		}
		System.out.println(rev);

	}

}

