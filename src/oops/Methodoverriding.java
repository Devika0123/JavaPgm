package oops;
class ParentC{
	public void job() {
		System.out.println("Engineer");
		}
	public void phone() {
		System.out.println("Samsung");
	}
}
class ChildC extends ParentC{

	@Override
	public void phone() {
	     System.out.println("Realme");
		super.phone();
	}

	@Override
	public void job() {
		System.out.println("Doctor");
	
		super.job();
	}
	
}

public class Methodoverriding {

	public static void main(String[] args) {
		ChildC ob=new ChildC();
		ob.job();
		ob.phone();

	}

}
