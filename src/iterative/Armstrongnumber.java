package iterative;

public class Armstrongnumber {

	public static void main(String[] args) {
		 //Armstrong number//153=(1*1*1)+(5*5*5)+(3*3*3)=1+125+27=153
		
		int n=153;
		int num=n;
		int sum=0;
		int digit;
		while(n>0)
		{
			digit=n%10; //153/10=3 //15/10=5  //1/10=1
			sum=sum+(digit*digit*digit);//0+27=27//27+125=152//152+1=153
			n=n/10;//153/10=15//15/10=1//1/10=0
		}
		if(sum==num)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}

	}

}
