import java.util.*;


public class StudentInfo 
{
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private int studentNo;
	private String studentProgram;
	private int studentYear;
	private String studentFaculty;
	private ArrayList<GeneralCourse> finishedCourses;
	private int completedCredits;
	private int remainingCredits;
	
	public StudentInfo(String userName, String password, String firstName, String lastName, int studentNo, String studentProgram, int 
			studentYear, String studentFaculty, ArrayList<GeneralCourse> finishedCourses, int completedCredits, int remainingCredits)
	{
		this.setUsername(userName);
		this.setPassword(password);
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
	
	public String getUsername()
	{
		return this.userName;
	}
	
	public void setUsername(String userName)
	{
		this.userName = userName;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
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
	
	public ArrayList<GeneralCourse> getFinishedCoursesList()
	{
		return this.finishedCourses;
	}
	
	public void setFinishedCoursesList(ArrayList<GeneralCourse> finishedCourses)
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
	
	public static ArrayList<StudentInfo> sampleStudentInfo()
	{
		ArrayList<StudentInfo> sInfo = new ArrayList<StudentInfo>();
		
		//Saad's completed courses
		ArrayList<GeneralCourse> saadCompletedCoursesComSci = new ArrayList<GeneralCourse>();
		saadCompletedCoursesComSci.add(new GeneralCourse("EECS 1001: Research in Computer Science", 1));		
		saadCompletedCoursesComSci.add(new GeneralCourse("EECS 2030: Java", 3));
		saadCompletedCoursesComSci.add(new GeneralCourse("EECS 2011: Data Structures", 3));
		saadCompletedCoursesComSci.add(new GeneralCourse("EECS 2021: Computer Organization", 3));
		saadCompletedCoursesComSci.add(new GeneralCourse("EECS 2031: Software Tools", 3));
		saadCompletedCoursesComSci.add(new GeneralCourse("EECS 2001: Theory of Computation", 3));
		saadCompletedCoursesComSci.add(new GeneralCourse("EECS 1012: Introduction to Computer Science 1", 3));
		saadCompletedCoursesComSci.add(new GeneralCourse("EECS 1022: Introduction to Computer Science 2", 3));
		saadCompletedCoursesComSci.add(new GeneralCourse("EECS 1019: Discrete Mathematics", 3));
		
		saadCompletedCoursesComSci.add(new GeneralCourse("MATH 1013: Applied Calculus 1", 3));
		saadCompletedCoursesComSci.add(new GeneralCourse("MATH 1014: Applied Calculus 2", 3));
		saadCompletedCoursesComSci.add(new GeneralCourse("MATH 1090: Introduction to Logic", 3));
		saadCompletedCoursesComSci.add(new GeneralCourse("MATH 2030: Elementary Probability", 3));
		
		
		
		
		
		//sInfo.add(new StudentInfo("lindan4", "12345678", "Lindan", "Thill", 213742176, "German Studies", 2017, "Faculty of Liberal Arts", lindanCompletedCoursesGerman, 90, 30));
		sInfo.add(new StudentInfo("saeeds28", "12345678", "Saad", "Saeed", 123445565, "Computer Science", 2017, "Lassonde School of Engineering", saadCompletedCoursesComSci, 60, 60));
		
		
		
		return sInfo;
	}
	
	

}