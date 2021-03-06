import java.util.*;


public class Degree 
{
	private String degreeName;
	private String degreeFaculty;
	private String degreeType;
	private int degreeDuration;
	private int totalCredits;
	private ArrayList<GeneralCourse> degreeCourses;
	
	public Degree(String degreeName, String degreeFaculty, String degreeType, int degreeDuration, int totalCredits)
	{
		this.setDegreeName(degreeName);
		this.setDegreeFaculty(degreeFaculty);
		this.setDegreeType(degreeType);
		this.setDegreeDuration(degreeDuration);
		this.setTotalCredits(totalCredits);
		this.setDegreeCourses(new ArrayList<GeneralCourse>());
	}
	
	public String getDegreeName()
	{
		return this.degreeName;
	}
	
	public void setDegreeName(String degreeName)
	{
		this.degreeName = degreeName;
	}
	
	public String getDegreeFaculty()
	{
		return this.degreeType;
	}
	
	public void setDegreeFaculty(String degreeFaculty)
	{
		this.degreeFaculty = degreeFaculty;
	}
	
	public String getDegreeType()
	{
		return this.degreeType;
	}
	
	public void setDegreeType(String degreeType)
	{
		this.degreeType = degreeType;
	}
	
	public int getDegreeDuration()
	{
		return this.degreeDuration;
	}
	
	public void setDegreeDuration(int degreeDuration)
	{
		this.degreeDuration = degreeDuration;
	}
	
	public int getTotalCredits()
	{
		return this.totalCredits;
	}
	
	public void setTotalCredits(int totalCredits)
	{
		this.totalCredits = totalCredits;
	}
	
	public ArrayList<GeneralCourse> getDegreeCourses()
	{
		return this.degreeCourses;
	}
	
	public void setDegreeCourses(ArrayList<GeneralCourse> degreeCourses)
	{
		this.degreeCourses = degreeCourses;
	}
	
	public static ArrayList<Degree> sampleDegreeList()
	{
		ArrayList<Degree> sampleList = new ArrayList<Degree>();
		
		//Nur für Informatik
		Degree cSci = new Degree("Computer Science", "Lassonde School of Engineering", "BSc", 3, 90);
		
		//Computer science degree courses
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 1001: Research in Computer Science", 1));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 2030: Java", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 2011: Data Structures", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 2021: Computer Organization", 4));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 2031: Software Tools", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 2001: Theory of Computation", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 1012: Introduction to Computer Science 1", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 1022: Introduction to Computer Science 2", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3000: Ethics in Computer Science", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3311: Software Design", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3101: Algorithm Anaysis", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3221: Operating Systems", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3421: Introduction to Database Systems", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 3461: User Interfaces", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("EECS 1019: Discrete Mathematics", 3));
		
		cSci.getDegreeCourses().add(new GeneralCourse("MATH 1013: Applied Calculus 1", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("MATH 1014: Applied Calculus 2", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("MATH 1090: Introduction to Logic", 3));
		cSci.getDegreeCourses().add(new GeneralCourse("MATH 2030: Elementary Probability", 3));
		
		
		sampleList.add(cSci);
		
		
		return sampleList;
	}
}
