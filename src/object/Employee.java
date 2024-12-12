package object;

public class Employee {
	
	int empid;
	String empname;
	String empdesgn;
	

	public static void main(String[] args) {
		// Object creation
		
		Employee emp1=new Employee();
		emp1.empid=101;
		System.out.println(emp1.empid=101);
		emp1.empname="Ardra";
		System.out.println(emp1.empname="Ardra");
		emp1.empdesgn="Test engineer";
		System.out.println(emp1.empdesgn="Test engineer");
		
		Employee emp2=new Employee();
		System.out.println(emp2.empid=102);
		System.out.println(emp2.empname="Annapoorna");
		System.out.println(emp2.empdesgn="Test engineer");
		
		
		

	}

}
