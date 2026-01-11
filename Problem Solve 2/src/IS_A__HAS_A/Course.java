package IS_A__HAS_A;

public class Course {

	String courseName;
	
	String coursePrice;
	
	String courseDuration;
	
	public Course(String courseName, String coursePrice, String courseDuration)
	{
		
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.courseDuration = courseDuration;
	}

	void displayCourse()
	{
		System.out.println("CName	  : "+courseName);
		System.out.println("CPrice 	  : "+coursePrice);
		System.out.println("CDuration : "+courseDuration);

	}
	
	
}
