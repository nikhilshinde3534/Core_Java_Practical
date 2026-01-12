package Inheritance_1;

public class Student extends Object{

	int rollNo;
	
	static String schoolName;
	
	String name;
	
	String address;
	
	int age;
	
	String mobileno;
	
	double marks;
	
	String email;
	
	String dateofBirth;
	
	public Student(int rollNo, String name, String address, int age, String mobileno, double marks, String email,
			String dateofBirth) 
	{
		
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.age = age;
		this.mobileno = mobileno;
		this.marks = marks;
		this.email = email;
		this.dateofBirth = dateofBirth;
	}

	
	void study()
	{
		System.out.println("Student is doing study");
	}
	
	void result()
	{
		char grade;
		if(marks>90)
		{
			grade='A';
			System.out.println(grade);
		}
		else if(marks>90 && marks>70) 
		{
			grade='B';
			System.out.println(grade);
		}
		else if(marks<70 && marks>50)
		{
			grade='C';
			System.out.println(grade);
		}
		else
		{
			System.out.println("Fail");
		}
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", age=" + age + ", mobileno="
				+ mobileno + ", marks=" + marks + ", email=" + email + ", dateofBirth=" + dateofBirth + "]";
	}
	
	// Represent the object into String format
	
}
