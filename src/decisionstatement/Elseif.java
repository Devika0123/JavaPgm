package decisionstatement;

public class Elseif {

	public static void main(String[] args) {
		int a=6,b=8,c=2;
		if(a>b&&a>c)
		{
			System.out.println("The largest number is a");
		}
		else if(b>a&&b>c) 
		{
			System.out.println("The largest number is b");
		}
		else
		{
			System.out.println("The largest number is c");
		}

	}

}
