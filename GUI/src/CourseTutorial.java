
public class CourseTutorial extends CourseActivity 
{

	public CourseTutorial(String activityInstructor, String dayAvailable, String timeFrame) {
		super(activityInstructor, dayAvailable, timeFrame);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Instructor: "+ this.getActivityInstructor()+" " + this.getDayAvailable()+ " "+ this.getTimeFrame();
	}

}
