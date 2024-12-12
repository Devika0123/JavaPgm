package oops;
class members{
	String name;
	int age;
	int phonenumber;
	String address;
	int sal;
	public void  printmthd()	
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Contact number:"+phonenumber);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+sal);
	}
}
class Employ extends members{
	String Department;
}
class Mangr extends members{
	String Specialisation;
}
		

public class Problemhierarchi {

	public static void main(String[] args) {
		Employ e1new=new Employ();
		e1new.name="Anju";
		e1new.age=23;
		e1new.phonenumber=659883654;
		e1new.address="Kollam";
		e1new.sal=26000;
		System.out.println(e1new.Department="Testing");
		e1new.printmthd();
		System.out.println("Manager Details");
		Mangr mnew=new Mangr();
		mnew.name="Santhosh";
		mnew.age=45;
		mnew.phonenumber=589632147;
		mnew.address="Kottayam";
		mnew.sal=50000;
		System.out.println(mnew.Specialisation ="Testing");
		mnew.printmthd();
				
		
		
	

	}

}
