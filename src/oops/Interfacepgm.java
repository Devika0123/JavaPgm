package oops;

interface CarDetails{
	public void acceleration();
	public void speedlimit();
	public void torque();
}
class Benz implements CarDetails{

	@Override
	public void acceleration() {
		System.out.println("Benz Acceleration")	;	
	}

	@Override
	public void speedlimit() {
		System.out.println("Benz speed limit");
		}

	@Override
	public void torque() {
		System.out.println("Benz Torque");
		
	}
	
}

public class Interfacepgm {
	

	public static void main(String[] args) {
		Benz ob=new Benz();
		ob.acceleration();
		ob.speedlimit();
		ob.torque();
		

	}

}
