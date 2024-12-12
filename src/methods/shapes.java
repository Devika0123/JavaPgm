package methods;

public class shapes {

	public static void main(String[] args) {
		shapes ob=new shapes();
		ob.square();
		System.out.println(ob.triangle());
		ob.rectangle(4,8);
		System.out.print(ob.circle(6));
		
	}
		 public void square()
		 {
			 int a=5,b;
			 b=a*a;
			 System.out.println(b);
		 }
		public double triangle()
		{
			int b=6,h=8;
			double t;
			t=0.5*b*h;
			return t;
		}
		public void rectangle(int l,int b)
		{
			int r=l*b;
			System.out.println(r);
		}
	   public double circle(int r)
	   {
		   double c=3.14*r*r;
		   return c;
	   }
	
	
	

}
