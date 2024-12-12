package oops;

 class car {
	public void displayMthd()
	{
		System.out.println("Cars details");
	}
}
	class Bmw extends car{
		public void bmvDetails()
		{
			System.out.println("BMW Car details");
		}
	}

public class singleinheritance {

		public static void main(String[] args) {
			
			
			Bmw ob=new Bmw();
			ob.displayMthd();//parent class method
			ob.bmvDetails();//child class method

		

	}

}
