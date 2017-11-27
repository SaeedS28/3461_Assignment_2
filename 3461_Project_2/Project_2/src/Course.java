import java.util.ArrayList;


public class Course 
{
	private String courseName;
	private String courseCode;
	private String courseTerm;
	private String courseDescription;
	private String courseFaculty;
	private ArrayList<Course> coursePrequisites;
	private ArrayList<Student> enrolledStudents;
	private float markPrerequisite;
	
	
	public Course(String courseName, String courseCode, String courseTerm, String courseDescription, String courseFaculty, ArrayList<Course> coursePrerequisites, ArrayList<Student> enrolledStudents, float markPrerequisite)
	{
		this.setCourseName(courseName);
		this.setCourseCode(courseCode);
		this.setCourseTerm(courseTerm);
		this.setCourseDescription(courseDescription);
		this.setCourseFaculty(courseFaculty);
		this.setCoursePrerequisites(coursePrerequisites);
		this.setEnrolledStudents(enrolledStudents);
		this.setMarkPrerequisite(markPrerequisite);
		
	}
	
	public String getCourseName()
	{
		return this.courseName;
	}
	
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	
	public String getCourseCode()
	{
		return this.courseCode;
	}
	
	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}
	
	public String getCourseTerm()
	{
		return this.courseTerm;
	}
	
	public void setCourseTerm(String courseTerm)
	{
		this.courseTerm = courseTerm;
	}
	
	public String getCourseDescription()
	{
		return this.courseDescription;
	}
	
	public void setCourseDescription(String courseDescription)
	{
		this.courseDescription = courseDescription;
	}
	
	public String getCourseFaculty()
	{
		return this.courseFaculty;
	}
	
	public void setCourseFaculty(String courseFaculty)
	{
		this.courseFaculty = courseFaculty;
	}
	
	public ArrayList<Course> getCoursePrerequisites()
	{
		return this.coursePrequisites;
	}
	
	public void setCoursePrerequisites(ArrayList<Course> coursePrerequisites)
	{
		this.coursePrequisites = coursePrerequisites;
	}
	
	public ArrayList<Student> getEnrolledStudents()
	{
		return this.enrolledStudents;
	}
	
	public void setEnrolledStudents(ArrayList<Student> enrolledStudents)
	{
		this.enrolledStudents = enrolledStudents;
	}
	
	public float getMarkPrerequisite()
	{
		return this.markPrerequisite;
	}
	
	public void setMarkPrerequisite(float markPrerequisite)
	{
		this.markPrerequisite = markPrerequisite;
	}
}
