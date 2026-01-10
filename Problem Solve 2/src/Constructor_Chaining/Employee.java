package Constructor_Chaining;

public class Employee {

	// Constructor Chaining
	
	Employee()
	{
		this(10);	// call to constructor which taking one int type parameter
		System.out.println("Non Parameter");
	}
	
	Employee(int i)
	{
		this(10,20);	// call to the constructor which taking two int parameter
		System.out.println("1 Parameter");
	}
	
	Employee(int i, int j)
	{
		System.out.println("2 Parameter");
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();	// 1st
		
	}
}
