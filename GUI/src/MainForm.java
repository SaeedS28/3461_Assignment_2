import java.awt.Font;

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
	
	private StudentLogin loginAttempt;
	CompositeAdd test;

	private static final long serialVersionUID = 1L;
	

	public MainForm(StudentLogin loginAttempt2) {
		//House Keeping
				super("An overview");
				this.setSize(800,785);
				this.setResizable(false);
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				this.setLocationRelativeTo(null);
				this.getContentPane().setLayout(null);
				
				this.loginAttempt = loginAttempt2;
				
				Font font= new Font("Arial", Font.BOLD, 30);
				Font font2= new Font("Arial", Font.BOLD, 20);
				
				//Title components
				title=new JLabel("Courses: ");
				title.setFont(font);
				title.setVisible(true);
				titlePanel = new JPanel();
				titlePanel.setLocation(30, 40);
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
				personInformation=new JLabel("<html>This is complete <br/> bullshit "
						+ "that will be over-written </html>");
				personInformation.setVisible(true);
				personInformation.setFont(font2);
				personInformationPanel=new JPanel();
				personInformationPanel.setLocation(30, 450);
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
				
				//Adding to the form
				this.add(logoutPanel);
				this.add(degreeProgressPanel);
				this.add(personInformationPanel);
				this.add(titlePanel);
				test=new CompositeAdd();
				this.add(test.getAddPanel());
				this.add(test.getExchangePanel());
				this.add(test.getCourseDetailPanel());
	}

	
	

}
