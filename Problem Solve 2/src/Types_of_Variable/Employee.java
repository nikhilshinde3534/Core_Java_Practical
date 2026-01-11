package Types_of_Variable;

public class Employee {

	// Instance variable / Global variable
	// The variable which is created inside class and outside 
	//			any method or constructor is called instance variable.
	
	int id;		// different for each emp
	
	String name;	// different for each emp
	
	double salary;
	
	// Instance variables are related to object 
	// Instance variable value for each object will change
	// Instance variable can be accessible within whole class
	// Instance variable we can access using object reference
	
	void calculateSalary()
	{
		
	}
	
	void show()
	{
		System.out.println("ID     : "+id);
		System.out.println("Name   : "+name);
		System.out.println("Salary : "+salary);
		
		System.out.println("=============================");

	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.id=1;
		e1.name="Nikhil";
		e1.salary=50000.00;
		e1.show();
		
		Employee e2 = new Employee();
		e2.id=2;
		e2.name="Shubham";
		e2.salary=40000.00;
		e2.show();
		
		Employee e3 = new Employee();
		e3.id=3;
		e3.name="Sahil";
		e3.salary=30000.00;
		e3.show();
		
	}
}
