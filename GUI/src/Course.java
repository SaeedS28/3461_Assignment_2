import java.util.ArrayList;


public class Course extends GeneralCourse
{
	private String courseTerm;
	private String courseDesc;
	private String courseInstructor;
	private ArrayList<CourseSchedule> courseSchedule;
	private ArrayList<CourseActivity> courseActivity;

	
	
	
	public Course(String courseName, int courseCredits, String courseTerm, String courseDesc, String courseInstructor, ArrayList<CourseSchedule> courseSchedule, ArrayList<CourseActivity> courseActivity)
	{
		super(courseName, courseCredits);
		this.setCourseTerm(courseTerm);
		this.setCourseDesc(courseDesc);
		this.setCourseInstructor(courseInstructor);
		this.setCourseSchedule(courseSchedule);
		this.setCourseActivity(courseActivity);
	}
	
	public String getCourseTerm()
	{
		return this.courseTerm;
	}
	
	public void setCourseTerm(String courseTerm)
	{
		this.courseTerm = courseTerm;
	}
	
	public String getCourseDesc()
	{
		return this.courseDesc;
	}
	
	public void setCourseDesc(String courseDesc)
	{
		this.courseDesc = courseDesc;
	}
	
	
	public String getCourseInstructor()
	{
		return this.courseInstructor;
	}
	
	public void setCourseInstructor(String courseInstructor)
	{
		this.courseInstructor = courseInstructor;
	}
	
	public ArrayList<CourseSchedule> getCourseSchedule()
	{
		return this.courseSchedule;
	}
	
	public void setCourseSchedule(ArrayList<CourseSchedule> courseSchedule)
	{
		this.courseSchedule = courseSchedule;
	}
	
	public ArrayList<CourseActivity> getCourseActivity()
	{
		return this.courseActivity;
	}
	
	public void setCourseActivity(ArrayList<CourseActivity> courseActivity)
	{
		this.courseActivity = courseActivity;
	}
}