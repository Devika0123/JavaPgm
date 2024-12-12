package oops;

abstract class Cars{
	 abstract public void  acceleration();
	 public void CarEngine() {
		 System.out.println("Engine details");
	 }
}
class Kia extends Cars{

	@Override
	public void acceleration() {
		System.out.println("Kia acceleration");
		
	}
	
}


public class Abstractionpgm {

	public static void main(String[] args) {
		Kia ob=new Kia();
		ob.acceleration();
		ob.CarEngine();
	}
		

}
