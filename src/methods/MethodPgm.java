package methods;

public class MethodPgm {

	public static void main(String[] args) {
		// Method
		MethodPgm ob=new MethodPgm();
		ob.add();
		ob.sub();
		System.out.println(ob.sub());
		ob.mul(10, 20);
		ob.div(50, 10);
		System.out.println(ob.div(50, 10));
		
		

	}
	//Method without return type and without parameters add()
	public void add() {
	int a=10,b=20,c;
	c=a+b;
	System.out.println(c);
	}
	
	//Method with return type and without parameters sub()
	
	public int sub() {
		int a=20,b=10,c;
		c=a-b;
	    return c;
	}
	
	//Method without return type and with parameters
	public void mul(int a,int b) {
		int c=a*b;
		System.out.println(c);
	}
	//Method with return type and with parameters
	public double div(int a,int b) {
		double d=a/b;
		return d;
		
	}
	
	

}
