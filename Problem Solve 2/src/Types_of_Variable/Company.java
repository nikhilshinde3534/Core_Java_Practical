package Types_of_Variable;

public class Company {

	// Static Variable
	
	static String companyName;
	// by using static keyword if we create a variable 
	// inside class and outside any method or constructor is called static variable
	
	// Static variable are related to class...
	// Static variable value is common for all objects
	// Static variable we can access directly using class...
	
	int id;
	String name;
	double salary;
	
	void show()
	{
		System.out.println("Company Name : "+companyName);
		System.out.println("ID     : "+id);
		System.out.println("Name   : "+name);
		System.out.println("Salary : "+salary);
		
		System.out.println("==========================");

	}
	
	public static void main(String[] args) {
		
		Company.companyName="Nikhil And Java";
		
		Company e1 = new Company();
		e1.id=1;
		e1.name="Nikhil";
		e1.salary=50000.00;
		e1.show();
		
		Company e2 = new Company();
		e2.id=2;
		e2.name="Shubham";
		e2.salary=40000.00;
		e2.show();
		
		Company e3 = new Company();
		e3.id=3;
		e3.name="Sahil";
		e3.salary=30000.00;
		e3.show();
	}
}
