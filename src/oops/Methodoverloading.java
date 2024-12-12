package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add();
		ob.add(5, 8);
		ob.add(4, 5.6);
		ob.add(5.3, 6);
	}
		
		
	
	public void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add (int a,double b) {
		double c= a+b ;
		System.out.println(c);
	}
	public void add(double a,int b) {
		double c= a+b;
		System.out.println(c);
	}

}
