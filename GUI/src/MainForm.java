import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MainForm extends JFrame{

	/**
	 * 
	 */
	
	JPanel logoutPanel;
	JButton logout;
	JPanel degreeProgressPanel;
	JButton degreeProgress;
	JPanel titlePanel;
	JLabel title;
	JPanel personInformationPanel;
	JLabel personInformation;
	JPanel addCoursePanel;
	JButton addCourse;
	
	private StudentLogin loginAttempt;
	private ArrayList<StudentInfo> sampleStudentInfo = StudentInfo.sampleStudentInfo();
	private String currentTerm = "FW 2017-2018";
	
	
	CompositeAdd[] test;
	int count=0;
	private static final long serialVersionUID = 1L;
	

	public MainForm(StudentLogin studentLoginInfo) {
		//House Keeping
				super("An overview");
				this.setSize(800,785);
				this.setResizable(false);
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				this.setLocationRelativeTo(null);
				this.getContentPane().setLayout(null);
				
				this.loginAttempt = studentLoginInfo;
				
				Font font= new Font("Arial", Font.BOLD, 30);
				Font font2= new Font("Arial", Font.BOLD, 20);
				
				//Title components
				title=new JLabel("Courses: ");
				title.setFont(font);
				title.setVisible(true);
				titlePanel = new JPanel();
				titlePanel.setLocation(30, 10);
				titlePanel.setSize(150, 50);
				titlePanel.add(title);
				
				//Logout components
				logout=new JButton("Logout");
				logout.setFont(font2);
				logout.setVisible(true);
				logoutPanel=new JPanel();
				logoutPanel.setLocation(680,0);
				logoutPanel.setSize(120,50);
				logoutPanel.add(logout);
				
				//Information Panel
				
				StudentInfo selectedUser = getStudent(studentLoginInfo);
				
				
				personInformation=new JLabel("<html><p>Program: " + selectedUser.getStudentDegree().getDegreeName() + " (" + selectedUser.getStudentDegree().getDegreeType() + ") " + "<br />" + "Current term: " + currentTerm + "<br />" + "Credits completed: " + selectedUser.getCompletedCredits() + "<br />" + "Credits remaining: " + selectedUser.getRemainingCredits() + "</p></html>");
				
				personInformation.setVisible(true);
				personInformation.setFont(font2);
				personInformationPanel=new JPanel();
				personInformationPanel.setLocation(30, 500);
				personInformationPanel.setSize(400, 250);
				personInformationPanel.add(personInformation);
				
				//Degree progress components
				degreeProgress=new JButton("Degree Progress");
				degreeProgress.setFont(font2);
				degreeProgress.setVisible(true);
				degreeProgressPanel=new JPanel();
				degreeProgressPanel.setLocation(593,700);
				degreeProgressPanel.setSize(200,50);
				degreeProgressPanel.add(degreeProgress);
				
				//add courses components
				addCourse = new JButton("Add Course");
				addCourse.setFont(font2);
				addCourse.setVisible(true);
				addCoursePanel= new JPanel();
				addCoursePanel.setLocation(30, 50);
				addCoursePanel.setSize(150, 50);
				addCoursePanel.add(addCourse);
				
				//Adding to the form
				this.add(logoutPanel);
				this.add(degreeProgressPanel);
				this.add(personInformationPanel);
				this.add(titlePanel);
				this.add(addCoursePanel);
				
				test=new CompositeAdd[10];
				for(int i=0;i<test.length;i++) {
					test[i]=new CompositeAdd();
				}
				for(int i =0;i<test.length;i++) {
					this.add(test[i].getAddPanel());
					this.add(test[i].getExchangePanel());
					this.add(test[i].getCourseDetailPanel());
				}
				
				addCourse.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(arg0.getSource()==addCourse) {
							if(count<test.length) {
								
								//test[count].getRemoveButton().setVisible(true);
								//test[count].getExchangeButton().setVisible(true);
								//test[count].getCourseLabel().setVisible(true);
								//test[count].getCourseLabel().setText("SXSM 1560: Intro to Porn studies");
								//addCoursePanel.setLocation(30, test[count].getCourseLabel().getLo);
								CourseSelectForm fuck = new CourseSelectForm();
								fuck.setVisible(true);
								count++;
							}
							else {
								JOptionPane.showMessageDialog(null, "Too many courses!");
							}
						}
					}
					
				});
	}
	
	public StudentInfo getStudent(StudentLogin info)
	{
		for (StudentInfo si : sampleStudentInfo)
		{
			if (info.getUsername().equals(si.getUsername()) && info.getPassword().equals(si.getPassword()))
			{
				return si;
			}
		}
		
		return null;
	}

}
