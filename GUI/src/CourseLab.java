
public class CourseLab extends CourseActivity
{
	
	public CourseLab(String activityInstructor, String dayAvailable, String timeFrame) {
		super(activityInstructor, dayAvailable, timeFrame);
		
	}

	@Override
	public String toString() {
		return "Instructor: "+ this.getActivityInstructor()+" " + this.getDayAvailable()+ " "+ this.getTimeFrame();
	}

	

}
