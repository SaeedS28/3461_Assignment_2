import java.util.ArrayList;


public class Course extends GeneralCourse
{
	private String courseTerm;
	private String courseDesc;
	private String courseInstructor;
	private CourseSchedule courseSchedule;
	private ArrayList<CourseActivity> courseActivity;
	private ArrayList<GeneralCourse> prereq;
	
	
	
	public Course(String courseName, int courseCredits, String courseTerm, String courseDesc, String courseInstructor, CourseSchedule courseSchedule, ArrayList<CourseActivity> courseActivity, ArrayList<GeneralCourse> prereq)
	{
		super(courseName, courseCredits);
		this.setCourseTerm(courseTerm);
		this.setCourseDesc(courseDesc);
		this.setCourseInstructor(courseInstructor);
		this.setCourseSchedule(courseSchedule);
		this.setCourseActivity(courseActivity);
		this.setPrereq(prereq);
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
	
	public CourseSchedule getCourseSchedule()
	{
		return this.courseSchedule;
	}
	
	public void setCourseSchedule(CourseSchedule courseSchedule)
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
	
	public ArrayList<GeneralCourse> getPrereq()
	{
		return this.prereq;
	}
	
	public void setPrereq(ArrayList<GeneralCourse> prereq)
	{
		this.prereq = prereq;
	}
	
	public static ArrayList<Course> generateComSciCourses()
	{
		ArrayList<Course> mockComCourses = new ArrayList<Course>();
		
		//EECS 1012
		ArrayList<CourseActivity> introCompSciAct = new ArrayList<CourseActivity>();
		CourseLab introCompSciLab = new CourseLab("Yon Koren", "W", "10:00 - 11:30"); 
		introCompSciAct.add(introCompSciLab);
		
		
		Course introCompSci = new Course("EECS 1012: Introduction to Computer Science 1", 3, "F Term", 
				"Students with no knowledge will familiarize themselves with the concepts through web programming.", "Melanie Baljko", 
				new CourseSchedule("CLH L", "M", "18:00 - 20:00"), introCompSciAct, null);
		mockComCourses.add(introCompSci);
		
		//EECS 1022
		
		//Activities
		
		
		CourseLab introToCompSciTwoLab = new CourseLab("Lind Thill", "T", "2:30 - 4:00");
		CourseLab Act2030= new CourseLab("B. Korobkin", "W", "2:30 - 4:00");
		CourseLab lab2011= new CourseLab("Brianna Banks", "F", "09:30 - 10:30");
		CourseLab lab2021= new CourseLab("Johnny Sins", "W", "13:30 - 15:00");
		CourseLab lab2031= new CourseLab("Ron Jeremy", "F", "18:30 - 20:00");
		CourseTutorial tutorial2001 = new CourseTutorial("Olivia Austin", "H", "10:30 - 12:00");
		
		ArrayList<CourseActivity> introToCompSciTwoAct = new ArrayList<CourseActivity>();
		ArrayList<CourseActivity> activity2001 = new ArrayList<CourseActivity>();
		ArrayList<CourseActivity> activity2011 = new ArrayList<CourseActivity>();
		ArrayList<CourseActivity> activity2030 = new ArrayList<CourseActivity>();
		ArrayList<CourseActivity> activity2021 = new ArrayList<CourseActivity>();
		ArrayList<CourseActivity> activity2031 = new ArrayList<CourseActivity>();
		
		activity2011.add(lab2011);
		activity2021.add(lab2021);
		activity2030.add(Act2030);
		activity2031.add(lab2031);
		activity2001.add(tutorial2001);
		
		//Prereqs
		ArrayList<GeneralCourse> prereqs2030 = new ArrayList<GeneralCourse>();
		ArrayList<GeneralCourse> prereqs2001 = new ArrayList<GeneralCourse>();
		ArrayList<GeneralCourse> prereqs2021 = new ArrayList<GeneralCourse>();
		ArrayList<GeneralCourse> prereqs2031 = new ArrayList<GeneralCourse>();
		ArrayList<GeneralCourse> prereqs2011 = new ArrayList<GeneralCourse>();
		
		prereqs2011.add(new GeneralCourse("EECS 1012: Introduction to Computer Science 1", 3));
		prereqs2011.add(new GeneralCourse("EECS 1022: Introduction to Computer Science 2", 3));
		prereqs2011.add(new GeneralCourse("EECS 2030: Java", 3));
		
		prereqs2030.add(new GeneralCourse("EECS 1012: Introduction to Computer Science 1", 3));
		prereqs2030.add(new GeneralCourse("EECS 1022: Introduction to Computer Science 2", 3));
		

		prereqs2001.add(new GeneralCourse("EECS 1022: Introduction to Computer Science 2", 3));
		prereqs2001.add(new GeneralCourse("EECS 1012: Introduction to Computer Science 1", 3));
		prereqs2001.add(new GeneralCourse("MATH 1019: Discrete Mathematics", 3));
		
		prereqs2021.add(new GeneralCourse("EECS 1012: Introduction to Computer Science 1", 3));
		prereqs2021.add(new GeneralCourse("EECS 1022: Introduction to Computer Science 2", 3));
		
		prereqs2031.add(new GeneralCourse("EECS 1012: Introduction to Computer Science 1", 3));
		prereqs2031.add(new GeneralCourse("EECS 2030: Java", 3));
		prereqs2031.add(new GeneralCourse("EECS 1022: Introduction to Computer Science 2", 3));
		
		//LINDAN's Course
		ArrayList<GeneralCourse> intoToCompScoTwoCoursePre = new ArrayList<GeneralCourse>();

		introToCompSciTwoAct.add(introToCompSciTwoLab);
		
		
		ArrayList<GeneralCourse> introToCompSciTwoCoursePreq = new ArrayList<GeneralCourse>();
		introToCompSciTwoCoursePreq.add(new GeneralCourse("EECS 1012: Introduction to Computer Science 1", 3));
		

		Course introCompSciTwo = new Course("EECS 1022: Introduction to Computer Science 2", 3, "W Term", 
				"Students will further their knowledge through web programming.", "Melanie Baljko", 
				new CourseSchedule("CLH L", "M", "18:00 - 20:00"), introToCompSciTwoAct, introToCompSciTwoCoursePreq);
		
		mockComCourses.add(introCompSciTwo);
		
		//Saad's Courses
		Course java2 = new Course("EECS 2030: Java", 3, "W Term", 
				"This course introduces students to the Java language", "Jackie Wang", 
				new CourseSchedule("LSB 105", "R", "18:00 - 19:30"), activity2030, prereqs2030);
		
		Course dataStructures = new Course("EECS 2011: Data Structures", 3, "F Term", 
				"This course introduces students to some of the most common data structures", "Tyler Noble", 
				new CourseSchedule("LAS B", "S", "09:00 - 10:30"), activity2011, prereqs2011);
		
		Course compOrg = new Course("EECS 2021: Computer Organization", 4, "F Term", 
				"This course introduces students to basic concepts of computer hardware", "Vivian Octave", 
				new CourseSchedule("LAS B", "F", "16:30-18:00"),activity2021, prereqs2021);
		
		Course softDesign = new Course("EECS 2031: Software Tools", 3, "W Term", 
				"This course introduces students to C programming Language and shell scripting", "Nikki Benz", 
				new CourseSchedule("CB 115", "W", "10:30-12:00"),activity2031, prereqs2031);
		
		Course theoryOfComp = new Course("EECS 2001: Inroduction to the theory of computing", 3, "W Term", 
				"This course introduces students to depression and suicide and how to deal with a low GPA", "Stella Cox", 
				new CourseSchedule("SLH F", "S", "14:00-15:30"),activity2001, prereqs2001);
		
		
		//EECS 1001
		Course researchInCompSci = new Course("EECS 1001: Research in Computer Science", 1, "Y Term", 
				"Students will learn about their research opportunities.", "Richard Wildes", 
				new CourseSchedule("CLH L", "F", "17:00 - 18:00"), null, null);
		
		mockComCourses.add(researchInCompSci);
		
		//EECS 1019
		Course discreteMathematics = new Course("EECS 1019: Discrete Mathematics", 3, "F Term", 
				"Students will learn about logic, sets, and recursion.", "George Tourlakis", 
				new CourseSchedule("CLH L", "T", "10:30 - 11:30"), null, null);
		
		mockComCourses.add(discreteMathematics);
		
		//MATH 1013
		Course appliedCalcOne = new Course("MATH 1013: Applied Calculus 1", 3, "F Term", 
				"Students will learn about logic, sets, and recursion.", "Valeri Michkine", 
				new CourseSchedule("CLH L", "R", "9:30 - 10:30"), null, null);
		
		mockComCourses.add(appliedCalcOne);
		
		//MATH 1014
		ArrayList<GeneralCourse> appliedCalcTwoPreq = new ArrayList<GeneralCourse>();
		appliedCalcTwoPreq.add(new GeneralCourse("MATH 1013: Applied Calculus 1", 3));
		
		
		Course appliedCalcTwo = new Course("MATH 1014: Applied Calculus 2", 3, "F Term", 
				"Students will learn about logic, sets, and recursion.", "Valeri Michkine", 
				new CourseSchedule("CLH L", "R", "10:30 - 11:30"), null, appliedCalcTwoPreq);
		
		mockComCourses.add(appliedCalcTwo);
		
		//EECS 3000
		ArrayList<GeneralCourse> ethicsPreq = new ArrayList<GeneralCourse>();
		ethicsPreq.add(new GeneralCourse("EECS 2030: Java", 3));
		
		
		Course ethics = new Course("EECS 3000: Ethics in Computer Science", 3, "F Term", 
				"Students will learn about the ethics and use of computer systems.", "Peter Cribb", 
				new CourseSchedule("CLH L", "R", "11:30 - 12:30"), null, ethicsPreq);
		
		mockComCourses.add(ethics);
		
		//EECS 3311
		ArrayList<GeneralCourse> softDesPreq = new ArrayList<GeneralCourse>();
		softDesPreq.add(new GeneralCourse("EECS 2011: Data Structures", 3));
		softDesPreq.add(new GeneralCourse("EECS 2031: Software Tools", 3));
		softDesPreq.add(new GeneralCourse("MATH 1090: Introduction to Logic", 3));
		
		ArrayList<CourseActivity> softDesAct = new ArrayList<CourseActivity>();
		softDesAct.add(new CourseLab("Jackie Wang", "W", "19:30 - 20:30"));
		
		Course softDes = new Course("EECS 3311: Software Design", 3, "F Term", 
				"Students will learn about eiffel.", "Jackie Wang", 
				new CourseSchedule("CLH L", "R", "12:30 - 13:30"), softDesAct, softDesPreq);
		
		mockComCourses.add(softDes);
		
		//EECS 3101
		ArrayList<GeneralCourse> anaPreq = new ArrayList<GeneralCourse>();
		anaPreq.add(new GeneralCourse("EECS 2030: Java", 3));
		anaPreq.add(new GeneralCourse("EECS 2011: Data Structures", 3));
		anaPreq.add(new GeneralCourse("MATH 1013: Applied Calculus 1", 3));
		
		ArrayList<CourseActivity> anaAct = new ArrayList<CourseActivity>();
		anaAct.add(new CourseTutorial("Jonathan Ostroff", "F", "20:00 - 21:00"));
		
		Course ana = new Course("EECS 3101: Algorithm Analysis", 3, "W Term", 
				"Students will learn more about algorithms.", "Jonathan Ostroff", 
				new CourseSchedule("R S128", "M", "11:30 - 12:30"), anaAct, anaPreq);
		
		mockComCourses.add(ana);
		
		//EECS 3221
		
		ArrayList<GeneralCourse> opSysPreq = new ArrayList<GeneralCourse>();
		opSysPreq.add(new GeneralCourse("EECS 2030: Java", 3));
		opSysPreq.add(new GeneralCourse("EECS 2021: Computer Organization", 4));
		opSysPreq.add(new GeneralCourse("EECS 2031: Software Tools", 3));
		
		Course opSys = new Course("EECS 3221: Operating Systems", 3, "W Term", 
				"Students will learn more about operating systems.", "Jia Xu", 
				new CourseSchedule("R S128", "M", "12:30 - 13:30"), null, opSysPreq);
		
		mockComCourses.add(opSys);
		
		//EECS 3421
		ArrayList<GeneralCourse> databasePreq = new ArrayList<GeneralCourse>();
		ethicsPreq.add(new GeneralCourse("EECS 2030: Java", 3));
		
		
		Course database = new Course("EECS 3421: Introduction to Database Systems", 3, "W Term", 
				"Students will learn about databases.", "Jarek Gryz", 
				new CourseSchedule("CLH L", "R", "13:30 - 14:30"), null, databasePreq);
		
		mockComCourses.add(database);
		
		//EECS 3461
		
		ArrayList<GeneralCourse> uiPreq = new ArrayList<GeneralCourse>();
		uiPreq.add(new GeneralCourse("EECS 2030: Java", 3));
		
		
		Course ui = new Course("EECS 3461: User Interfaces", 3, "W Term", 
				"Students will hopefully learn about user interfaces.", "Melanie Baljko", 
				new CourseSchedule("CLH L", "R", "14:30 - 15:30"), null, uiPreq);
		
		mockComCourses.add(ui);
		
		//ArrayList
		
		
		//Course
		
		
		/*
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 1001: Research in Computer Science", 1));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 1012: Introduction to Computer Science 1", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 1022: Introduction to Computer Science 2", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 1019: Discrete Mathematics", 3));
	
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 2030: Java", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 2011: Data Structures", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 2021: Computer Organization", 4));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 2031: Software Tools", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 2001: Theory of Computation", 3));
		
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3000: Ethics in Computer Science", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3311: Software Design", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3101: Algorithm Analysis", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3221: Operating Systems", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3421: Introduction to Database Systems", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3461: User Interfaces", 3));
			
		cSci.getDegreeCourses().add(new GeneralCourse("MATH 1013: Applied Calculus 1", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("MATH 1014: Applied Calculus 2", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("MATH 1090: Introduction to Logic", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("MATH 2030: Elementary Probability", 3));
		*/
		
		return mockComCourses;
	}
	
	
}