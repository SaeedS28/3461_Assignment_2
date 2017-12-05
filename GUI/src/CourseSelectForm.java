import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class CourseSelectForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	JPanel titlePanel;
	JLabel title;
	JList courseOption;
	JScrollPane scroller;
	JPanel listPanel;
	JPanel captionTitle;
	JLabel captionTitleLabel;
	JPanel textPanel;
	JTextField text;
	JPanel enterPanel;
	JButton enter;
	JPanel cancelPanel;
	JButton cancel;
	String [] dummyData= {"1","2","3","4","5","6"};
	StudentInfo studentInfo;
	MainForm localMf;
	CourseSelectForm cf;
	
	int calledAf = 0;
	
	boolean toAddOrToRemove;
	private ArrayList<CourseSuggestionOption> studentOptions;
	
	private ArrayList<Course> enrolledCourses;
	private Course theSelectedCourse;
	
	@SuppressWarnings("rawtypes")
	
	public CourseSelectForm(StudentInfo studentInfo, MainForm mf, Course selectedCourse, ArrayList<Course> studentEnrolledCourses, boolean flag) 
	{
		super("Select Course");
		this.studentInfo=studentInfo;
		toAddOrToRemove = flag;
		cf = this;
		this.enrolledCourses = studentEnrolledCourses;
		theSelectedCourse = selectedCourse;
		this.setSize(675,480);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.localMf=mf;
		//Component initialization
		this.getContentPane().setLayout(null);
		
		Font font= new Font("Arial", Font.BOLD, 26);
		Font font2= new Font("Arial", Font.BOLD, 20);
		Font font3= new Font("Arial", Font.BOLD, 15);
		
		//Title components
		titlePanel=new JPanel();
		title=new JLabel("Select course from the list");
		title.setFont(font);
		title.setVisible(true);
		titlePanel.setLocation(155, 50);
		titlePanel.setSize(350, 70);
		titlePanel.add(title);
		
		//List components
		studentOptions = this.generateOptions(this.courseDiff(Course.generateComSciCourses(), studentInfo.getFinishedCoursesList()));
		courseOption = new JList(studentOptions.toArray());
		
		courseOption.setVisible(true);
		courseOption.setFont(font2);
		courseOption.setVisibleRowCount(4);
		courseOption.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scroller=new JScrollPane(courseOption);
		listPanel = new JPanel();
		listPanel.setLocation(30,130);
		listPanel.setSize(600,120);
		listPanel.add(scroller);
		
		//Or enter the course code title
		captionTitleLabel=new JLabel("List generated based on completed prereqs and seat availability");
		captionTitleLabel.setFont(font3);
		captionTitleLabel.setVisible(true);
		captionTitle=new JPanel();
		captionTitle.setLocation(80,300);
		captionTitle.setSize(500, 70);
		captionTitle.add(captionTitleLabel);

		//Enter button components
		enter=new JButton("Confirm");
		enter.setFont(font2);
		enter.setVisible(true);
		enterPanel=new JPanel();
		enterPanel.setLocation(190, 380);
		enterPanel.setSize(110, 50);
		enterPanel.add(enter);
		
		
		
		//Cancel button components
		cancel=new JButton("Cancel");
		cancel.setFont(font2);
		cancel.setVisible(true);
		cancelPanel=new JPanel();
		cancelPanel.setLocation(355, 380);
		cancelPanel.setSize(100, 50);
		cancelPanel.add(cancel);
		
		//Add things to the JFrame
		this.add(titlePanel);
		this.add(listPanel);
		this.add(captionTitle);
		this.add(enterPanel);
		this.add(cancelPanel);
		
		
		cancel.addActionListener(new ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==cancel) {
					dispose();
				}
				
			}
			
		});
		
		enter.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==enter && calledAf == 0) 
				{
					int response = JOptionPane.showConfirmDialog(null, "\"" + studentOptions.get(courseOption.getSelectedIndex()) +"\" will be added. Continue?", "Confirm course addition",JOptionPane.YES_NO_OPTION);
					
					if (response == JOptionPane.YES_OPTION)
					{
						Course selectedCourse = getSelectedCourse(studentOptions.get(courseOption.getSelectedIndex()).getCourse().getGeneralCourseName());
						
						if (selectedCourse.getCourseActivity() == null)
						{
							if (toAddOrToRemove)
							{
								mf.addToCourseList(selectedCourse);
								dispose();
							}
							else
							{
								
									mf.exchangeCourse(theSelectedCourse, selectedCourse);
									dispose();
									calledAf = 1;
								
									
							}
								
							
							//System.out.println("rape me, daddy!");
							//dispose							
						}
						else
						{
							ActivitySelectionForm ca = new ActivitySelectionForm(mf, cf, selectedCourse);
							ca.setVisible(true);
							
						}
						
					}
					else
					{
						dispose();
					}
					
					
					
				}
				
			}
		});
	
	}
		
			
	
	public String[] generateSuggestions()
	{
		//ArrayList<Course> listOfCourses = new ArrayList<Course>();
		ArrayList<Course> comSciCourses = Course.generateComSciCourses();
		ArrayList<GeneralCourse> saadCourses = StudentInfo.sampleStudentInfo().get(0).getFinishedCoursesList();
		
		//ArrayList<GeneralCourse> studentCourses = this.studentInfo.getFinishedCoursesList();
		ArrayList<GeneralCourse> degreeCourses = this.studentInfo.getStudentDegree().getDegreeCourses();
		String[] array= new String[degreeCourses.size()];
		
		
		return array;
		
	}
	
	
	private ArrayList<Course> courseDiff(ArrayList<Course> courses, ArrayList<GeneralCourse> generalCourses)
	{
		ArrayList<Course> untakenCourses = new ArrayList<Course>();
		
		boolean courseExists = false;
		//Iterate over Saad's courses
		
		for (int i = 0; i < courses.size(); i = i + 1)
		{
			for (int j = 0; j < generalCourses.size(); j = j + 1)
			{
				if (generalCourses.get(j).getGeneralCourseName().equals(courses.get(i).getGeneralCourseName()))
				{
					courseExists = true;
				}
			}
			
			if (courseExists)
			{
				
				courseExists = false;
			}
			else
			{
				untakenCourses.add(courses.get(i));
				
			}
			
		}
		
		for (Course sH : enrolledCourses)
		{
			for (int k = 0; k < untakenCourses.size(); k = k + 1)
			{
				if (sH.getGeneralCourseName().equals(untakenCourses.get(k).getGeneralCourseName()))
				{
					untakenCourses.remove(k);
				}
			}
		}
		
		return untakenCourses;
	}
	
	
	private ArrayList<CourseSuggestionOption> generateOptions(ArrayList<Course> courses)
	{
		ArrayList<CourseSuggestionOption> scheisse = new ArrayList<CourseSuggestionOption>();
		for (Course cs: courses)
		{
			scheisse.add(new CourseSuggestionOption(cs));
		}
		
		return scheisse;
		
		
	}
	
	private Course getSelectedCourse(String courseName)
	{
		ArrayList<Course> geneCours = Course.generateComSciCourses();
		
		for (Course c : geneCours)
		{
			if (c.getGeneralCourseName().equals(courseName))
			{
				return c;
			}
		}
		return null;
	}
	

}
