import java.awt.Font;

import javax.swing.*;

public class CompositeAdd {
	
	JPanel addPanel;
	JPanel exchangePanel;
	JPanel courseDetailsPanel;
	JButton exchangeButton;
	JButton addButton;
	JLabel courseDetails;
	static int count=80;
	
	public CompositeAdd() {
		count+=40;
		Font font= new Font("Arial", Font.BOLD, 20);
		addPanel=new JPanel();
		exchangePanel = new JPanel();
		courseDetailsPanel =new JPanel();
		exchangeButton = new JButton("+/-");
		exchangeButton.setVisible(true);
		exchangeButton.setFont(font);
		addButton = new JButton("+");
		addButton.setVisible(true);
		addButton.setFont(font);
		courseDetails = new JLabel("SXSM 1560: Intro to Porn Studies");
		courseDetails.setVisible(true);
		courseDetails.setFont(font);
		
		//component setup
		addPanel.setLocation(400, count);
		addPanel.setSize(50,40);
		addPanel.add(addButton);
		
		exchangePanel.setLocation(460, count);
		exchangePanel.setSize(60,40);
		exchangePanel.add(exchangeButton);
		
		courseDetailsPanel.setLocation(30, count);
		courseDetailsPanel.setSize(340, 40);
		courseDetailsPanel.add(courseDetails);
		
	}
	
	public JPanel getAddPanel() {
		return this.addPanel;
	}
	
	public JPanel getExchangePanel() {
		return this.exchangePanel;
	}
	
	public JPanel getCourseDetailPanel() {
		return this.courseDetailsPanel;
	}
	
}