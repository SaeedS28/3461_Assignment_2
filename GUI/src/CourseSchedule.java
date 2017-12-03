
public class CourseSchedule 
{
	private String courseLocation;
	private String daysOffered;
	private String timeFrame;
	
	public CourseSchedule(String courseLocation, String daysOffered, String timeFrame)
	{
		this.setCourseLocation(courseLocation);
		this.setDaysOffered(daysOffered);
		this.setTimeFrame(timeFrame);
		
	}
	
	public String getCourseLocation()
	{
		return this.courseLocation;
	}
	
	public void setCourseLocation(String courseLocation)
	{
		this.courseLocation = courseLocation;
	}
	
	public String getDaysOffered()
	{
		return this.daysOffered;
	}
	
	public void setDaysOffered(String daysOffered)
	{
		this.daysOffered = daysOffered;
	}
	
	public String getTimeFrame()
	{
		return this.timeFrame;
	}
	
	public void setTimeFrame(String timeFrame)
	{
		this.timeFrame = timeFrame;
	}

}
