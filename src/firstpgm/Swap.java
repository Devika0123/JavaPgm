package firstpgm;

public class Swap {

	public static void main(java.lang.String[] args) {
		
		int a=20,b=30,c;
		System.out.println("value of a before swapping" +a+"\n"+"value of b before swapping "+b);
		c=a;//c=20
		a=b;//30
		b=c;//20
		System.out.println("value of a after swapping"+a+"\n"+"value of b after swapping"+b);

	}

}