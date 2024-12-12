package decisionstatement;

public class Nestedif {

	public static void main(String[] args) {
		int a=55;
		if(a%5==0)
		{
			if(a%11==0)
			{
				System.out.println("a is divisible by both 5 and 11");
			}
			else
			{
				System.out.println("a is divisible by 5 but not by 11");
			}
		}
			else
			{
		
		       System.out.println(a+"is not divisible by  both 5 and 11");
			}
			}

	}


