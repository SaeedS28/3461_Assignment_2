
public abstract class CourseActivity 
{
	
	private String activityInstructor;
	private String dayAvailable;
	private String timeFrame;
	
	public CourseActivity(String activityInstructor, String dayAvailable, String timeFrame)
	{
		this.setActivityInstructor(activityInstructor);
		this.setDayAvailable(dayAvailable);
		this.setTimeFrame(timeFrame);
		
	}
	
	public abstract String toString();

	public String getTimeFrame() {
		return timeFrame;
	}

	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}

	public String getDayAvailable() {
		return dayAvailable;
	}

	public void setDayAvailable(String dayAvailable) {
		this.dayAvailable = dayAvailable;
	}

	public String getActivityInstructor() {
		return activityInstructor;
	}

	public void setActivityInstructor(String activityInstructor) {
		this.activityInstructor = activityInstructor;
	}

}
