package Inheritance_1;

public class StudentCollege extends Student{
	
	String university;
	
	String cource;
	
	String prnNo;
	
	String faculty;
	
	int studentId;
	
	String department;
	
	String branch;
	
	double fees;
	
	double cgpa;
	
	String currentYear;
	
	
	public StudentCollege(int rollNo, String name, String address, int age, String mobileno, double marks, String email,
			String dateofBirth, String university, String cource, String prnNo, String faculty, int studentId,
			String department, String branch, double fees, double cgpa, String currentYear) {
		super(rollNo, name, address, age, mobileno, marks, email, dateofBirth);
		this.university = university;
		this.cource = cource;
		this.prnNo = prnNo;
		this.faculty = faculty;
		this.studentId = studentId;
		this.department = department;
		this.branch = branch;
		this.fees = fees;
		this.cgpa = cgpa;
		this.currentYear = currentYear;
	}



	void placements()
	{
		if(cgpa>9)
		{
			System.out.println("Eligible for placements");
		}
	}



	@Override
	public String toString() {
		return "StudentCollege [university=" + university + ", cource=" + cource + ", prnNo=" + prnNo + ", faculty="
				+ faculty + ", studentId=" + studentId + ", department=" + department + ", branch=" + branch + ", fees="
				+ fees + ", cgpa=" + cgpa + ", currentYear=" + currentYear + "]";
	}
	
	
}
