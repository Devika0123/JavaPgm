package firstpgm;

public class Operators {

	public static void main(java.lang.String[] args)  {
		
	// Arithmetic operators
		
		int a=10,b=30;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
	
	//Assignment Operators
		
		int c=a;//40
		System.out.println((a+=b)); //a=a+b 30+10=40
	
		System.out.println((a-=b)); //a=a-b 40-30=10
		
		
	//Relational Operators(True/False)
		
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		System.out.println(a>b);//false
		System.out.println(a>=b);//false
		System.out.println(a<b);//true
		System.out.println(a<=b);//true
		
	//Logical Operators
		
		//  A    B    A&&B   A||B   !A     !B
		//  0    0     0      0      1      1
		//  1    0     0      1      0      1
		//  0    1     0      1      1      0
		//  1    1     1      1      0      0
		
		java.lang.String username="abc";
		java.lang.String password="abc123";
		System.out.println((username=="abc")&&(password=="abc123"));
		System.out.println((username=="xyz")&&(password=="abc123"));
		System.out.println(!(username=="abc1"));
		System.out.println(!(password=="abc1"));
		System.out.println((username=="XYZ")||(password=="abc123"));
		
    //Unary Operators
		
		int c1=10,c2=20;
		
		//c1++ post increment
		//++c1 pre increment
		
		System.out.println(c1++);//10
		System.out.println(c1);//11
		System.out.println(++c1);//12
		System.out.println(c1--);//12
		System.out.println(--c1);//10
		
	//Ternary Operators (?:)
	//syntax variable=condition?exp1:exp2
		java.lang.String v=c2>c1?"c2 is larger":"c1 is larger";
		System.out.println(v);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		

	}

}
