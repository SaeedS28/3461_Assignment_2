import java.util.*;


public class Student 
{
	private String firstName;
	private String lastName;
	private int studentNo;
	private String studentProgram;
	private int studentYear;
	private String studentFaculty;
	private ArrayList<Course> finishedCourses;
	private int completedCredits;
	private int remainingCredits;
	
	public Student(String firstName, String lastName, int studentNo, String studentProgram, int 
			studentYear, String studentFaculty, ArrayList<Course> finishedCourses, int completedCredits, int remainingCredits)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setStudentNo(studentNo);
		this.setStudentProgram(studentProgram);
		this.setStudentYear(studentYear);
		this.setStudentFaculty(studentFaculty);
		this.setFinishedCoursesList(finishedCourses);
		this.setCompletedCredits(completedCredits);
		this.setRemainingCredits(remainingCredits);
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public int getStudentNo()
	{
		return this.studentNo;
	}
	
	public void setStudentNo(int studentNo)
	{
		this.studentNo = studentNo;
	}
	
	public String getStudentProgram()
	{
		return this.studentProgram;
	}
	
	public void setStudentProgram(String studentProgram)
	{
		this.studentProgram = studentProgram;
	}
	
	public int getStudentYear()
	{
		return this.studentYear;
	}
	
	public void setStudentYear(int studentYear)
	{
		this.studentYear = studentYear;
	}
	
	public String getStudentFaculty()
	{
		return this.studentFaculty;
	}
	
	public void setStudentFaculty(String studentFaculty)
	{
		this.studentFaculty = studentFaculty;
	}
	
	public ArrayList<Course> getFinishedCoursesList()
	{
		return this.finishedCourses;
	}
	
	public void setFinishedCoursesList(ArrayList<Course> finishedCourses)
	{
		this.finishedCourses = finishedCourses;
	}
	
	public int getCompletedCredits()
	{
		return this.completedCredits;
	}
	
	public void setCompletedCredits(int completedCredits)
	{
		this.completedCredits = completedCredits;
	}
	
	public int getRemainingCredits()
	{
		return this.remainingCredits;
	}
	
	public void setRemainingCredits(int remainingCredits)
	{
		this.remainingCredits = remainingCredits;
	}

}
