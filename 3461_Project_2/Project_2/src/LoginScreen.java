import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.*;

public class LoginScreen extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel mainPanel1;
	JPanel mainPanel0;
	JLabel userName;
	JLabel labelName;
	JTextField username;
	JPasswordField field;	
	
	public LoginScreen(){
		
		//Window initialization
		super("Login Screen");
		this.setSize(750,600);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//Component initialization
		this.getContentPane().setLayout(null);
		mainPanel1 = new JPanel();
		mainPanel0 = new JPanel();
	
		
		mainPanel0.setLocation(125, 150);
		mainPanel0.setSize(100, 30);
		mainPanel1.setSize(350, 40);
		mainPanel1.setLocation(250, 150);
	
		userName = new JLabel("Username");
		userName.setFont(new Font("Arial", Font.BOLD, 20));
		userName.setVisible(true);
		username=new JTextField(20);
		username.setFont(new Font("Arial", Font.BOLD, 20));
		username.setVisible(true);
		mainPanel0.add(userName);
		mainPanel1.add(username);
		
		
		this.add(mainPanel1);
		this.add(mainPanel0);
		
	}

}