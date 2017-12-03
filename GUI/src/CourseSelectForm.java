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
	
	private ArrayList<CourseSuggestionOption> studentOptions;
	
	@SuppressWarnings("rawtypes")
	
	public CourseSelectForm(StudentInfo studentInfo) 
	{
		super("Select Course");
		this.studentInfo=studentInfo;
		this.setSize(675,500);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//Component initialization
		this.getContentPane().setLayout(null);
		
		Font font= new Font("Arial", Font.BOLD, 26);
		Font font2= new Font("Arial", Font.BOLD, 20);
		
		//Title components
		titlePanel=new JPanel();
		title=new JLabel("Select course from the list");
		title.setFont(font);
		title.setVisible(true);
		titlePanel.setLocation(165, 50);
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
		listPanel.setLocation(50,130);
		listPanel.setSize(600,120);
		listPanel.add(scroller);
		
		//Or enter the course code title
		captionTitleLabel=new JLabel("Or enter the course code below");
		captionTitleLabel.setFont(font);
		captionTitleLabel.setVisible(true);
		captionTitle=new JPanel();
		captionTitle.setLocation(135,300);
		captionTitle.setSize(400, 70);
		captionTitle.add(captionTitleLabel);
		
		//textfield component
		text = new JTextField(15);
		text.setFont(font2);
		text.setVisible(true);
		textPanel = new JPanel();
		textPanel.setLocation(190, 350);
		textPanel.setSize(275,40);
		textPanel.add(text);
		
		//Enter button components
		enter=new JButton("Enter");
		enter.setFont(font2);
		enter.setVisible(true);
		enterPanel=new JPanel();
		enterPanel.setLocation(190, 400);
		enterPanel.setSize(95, 50);
		enterPanel.add(enter);
		
		//Cancel button components
		cancel=new JButton("Cancel");
		cancel.setFont(font2);
		cancel.setVisible(true);
		cancelPanel=new JPanel();
		cancelPanel.setLocation(355, 400);
		cancelPanel.setSize(100, 50);
		cancelPanel.add(cancel);
		
		//Add things to the JFrame
		this.add(titlePanel);
		this.add(listPanel);
		this.add(captionTitle);
		this.add(textPanel);
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
				if(e.getSource()==enter) 
				{
					JOptionPane.showConfirmDialog(null, "\"" + studentOptions.get(courseOption.getSelectedIndex()) +"\" will be added. Continue?", "Confirm course addition",JOptionPane.YES_NO_OPTION);
				
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
		
		for(int i=0;i<degreeCourses.size();i++) {
			array[i]=degreeCourses.get(i).getGeneralCourseName();
		}	
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
	

}
