import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.util.*;
public class ActivitySelectionForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel titlePanel;
	JLabel title;
	JList courseOption;
	JScrollPane scroller;
	JPanel listPanel;
	JPanel confirmPanel;
	JButton confirm;
	JList tutorialOption;
	JScrollPane tutorialScroller;
	JPanel tutorialListPanel;
	MainForm thisMf;
	CourseSelectForm thisCf;
	ArrayList<CourseActivity> activity;
	
	boolean tutVisible = false;
	boolean labVisible = false;
	
	
	public ActivitySelectionForm(MainForm mf, CourseSelectForm cf, Course course) {
		super("Select the activity");
		thisMf = mf;
		thisCf = cf;
		activity= course.getCourseActivity();
		this.setSize(675,450);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//Component initialization
		this.getContentPane().setLayout(null);
		
		Font font= new Font("Arial", Font.BOLD, 26);
		Font font2= new Font("Arial", Font.BOLD, 20);
		
		//Title components
		titlePanel=new JPanel();
		title=new JLabel();
		title.setFont(font);
		title.setVisible(true);
		titlePanel.setLocation(125, 50);
		titlePanel.setSize(450, 70);
		titlePanel.add(title);
		
		//List components
		courseOption = new JList(getLabs(course).toArray());
		if(!(courseOption.getModel().getSize()==0)) {
			title.setText("Select a lab");
			courseOption.setVisible(true);
			courseOption.setFont(font2);
			courseOption.setVisibleRowCount(4);
			courseOption.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			scroller=new JScrollPane(courseOption);
			listPanel = new JPanel();
			listPanel.setLocation(100,120);
			listPanel.setSize(500,150);
			listPanel.add(scroller);
			this.add(listPanel);
			labVisible = true;
		}
		else {
		//Tutorial list components
			title.setText("Select a tutorial");
			tutorialOption = new JList(getTutorials(course).toArray());
			tutorialOption.setVisible(true);
			tutorialOption.setFont(font2);
			tutorialOption.setVisibleRowCount(4);
			tutorialOption.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			tutorialScroller=new JScrollPane(tutorialOption);
			tutorialListPanel = new JPanel();
			tutorialListPanel.setLocation(100,120);
			tutorialListPanel.setSize(500,150);
			tutorialListPanel.add(tutorialScroller);
			this.add(tutorialListPanel);
			tutVisible = true;
		}
		//Confirm button components
		confirm=new JButton("Confirm");
		confirm.setFont(font2);
		confirm.setVisible(true);
		confirm.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if (e.getSource() == confirm)
				{
					if (tutVisible)
					{
						if (tutorialOption.getSelectedIndex() > -1)
						{
							mf.addToCourseList(course);
							
							dispose();	
							cf.dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null, "No tutorial/lab was selected.");
						}
					}
					else
					{
						if (courseOption.getSelectedIndex() > -1)
						{
							mf.addToCourseList(course);
							dispose();
							cf.dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null, "No tutorial/lab was selected.");
						}
					}
					
				}
				
			}	
		});
		confirmPanel=new JPanel();
		confirmPanel.setLocation(290, 350);
		confirmPanel.setSize(120, 50);
		confirmPanel.add(confirm);
		
		//Add things to the JFrame
		this.add(titlePanel);
		//this.add(listPanel);
		this.add(confirmPanel);
	}
	
	private ArrayList<CourseLab> getLabs(Course course)
	{
		ArrayList<CourseLab> cls=new ArrayList<CourseLab>();
		for (CourseActivity cAct: course.getCourseActivity()) 
		{
			if (cAct instanceof CourseLab)
			{
				cls.add((CourseLab)cAct);
			}
			
		}
		return cls;

	}
	
	private ArrayList<CourseTutorial> getTutorials(Course course)
	{
		ArrayList<CourseTutorial> cls=new ArrayList<CourseTutorial>();
		for (CourseActivity cAct: course.getCourseActivity()) 
		{
			if (cAct instanceof CourseTutorial)
			{
				cls.add((CourseTutorial)cAct);
			}
			
		}
		return cls;

	}
}
