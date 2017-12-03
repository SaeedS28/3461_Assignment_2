import java.util.*;


public class GeneralCourse 
{
	
	
	private String generalCourseName;
	private int courseCredits;
	
	public GeneralCourse(String generalCourseName, int courseCredits)
	{
		this.setCompletedCourseName(generalCourseName);
		this.setCourseCredits(courseCredits);
	}
	
	public String getCompletedCourseName()
	{
		return this.generalCourseName;
	}
	
	public void setCompletedCourseName(String completedCourseName)
	{
		this.generalCourseName = completedCourseName;
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
