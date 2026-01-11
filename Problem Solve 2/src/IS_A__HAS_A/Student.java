package IS_A__HAS_A;

public class Student {

	int id;
	
	String name;
	
	String email;
	
	Course course; //Student HAS-A Course

	public Student(int id,String name, String email, Course course ) 
	{
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
	}
	
	void display()
	{
		System.out.println("ID    : "+id);
		System.out.println("Name  : "+name);
		System.out.println("Email : "+email);
		course.displayCourse();
	}
	

	public static void main(String[] args) {
		
		Course c1 = new Course("JavaFullStack", "8000", "6 Month");
		
		Student s1 = new Student(1, "Nikhil", "nikhilshinde.3534@gmail.com", c1);
		
		s1.display();
	}
}
