import java.util.*;


public class StudentLogin 
{
	private String userName;
	private String password;
	
	public StudentLogin(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}
	
	public String getUsername()
	{
		return this.userName;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
}
