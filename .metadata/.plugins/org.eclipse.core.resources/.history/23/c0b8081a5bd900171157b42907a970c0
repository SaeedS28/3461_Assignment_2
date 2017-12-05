import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class DegreeProgress extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel titlePanel;
	JLabel title;
	JList courseOption;
	JScrollPane scroller;
	JPanel listPanel;
	JPanel backPanel;
	JButton back;
	String [] dummyData= {"1","2","3","4","5","6"};
	
	
	@SuppressWarnings("rawtypes")
	public DegreeProgress () {
		super("Select Courses");
		
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
		title=new JLabel("List of completed courses");
		title.setFont(font);
		title.setVisible(true);
		titlePanel.setLocation(165, 50);
		titlePanel.setSize(350, 70);
		titlePanel.add(title);
		
		//List components
		courseOption = new JList(dummyData);
		courseOption.setVisible(true);
		courseOption.setFont(font2);
		courseOption.setVisibleRowCount(8);
		courseOption.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scroller=new JScrollPane(courseOption);
		listPanel = new JPanel();
		listPanel.setLocation(50,120);
		listPanel.setSize(600,230);
		listPanel.add(scroller);
		
		//Cancel button components
		back=new JButton("Back");
		back.setFont(font2);
		back.setVisible(true);
		backPanel=new JPanel();
		backPanel.setLocation(290, 375);
		backPanel.setSize(100, 50);
		backPanel.add(back);
		
		//Add things to the JFrame
		this.add(titlePanel);
		this.add(listPanel);
		this.add(backPanel);
		
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==back) {
					dispose();
				}
			}
			
		});
	}
}
