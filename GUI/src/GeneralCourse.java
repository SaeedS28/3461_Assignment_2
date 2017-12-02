import java.util.*;


public class GeneralCourse 
{
	
	
	private String completedCourseName;
	private int courseCredits;
	
	public GeneralCourse(String completedCourseName, int courseCredits)
	{
		this.setCompletedCourseName(completedCourseName);
		this.setCourseCredits(courseCredits);
	}
	
	public String getCompletedCourseName()
	{
		return this.completedCourseName;
	}
	
	public void setCompletedCourseName(String completedCourseName)
	{
		this.completedCourseName = completedCourseName;
	}
	
	
	public int getCourseCredits()
	{
		return this.courseCredits;
	}
	
	public void setCourseCredits(int courseCredits)
	{
		this.courseCredits = courseCredits;
	}

}
