package Encapsulation;
class Gmail{
	private String Username,Password;
	public void setUsername(String Username)
	{
		this.Username=Username;
		
	}
	public void setPassword(String Password)
	{
		this.Password=Password;
	}
	public String getUsername()
	{
		if(Username=="abc@gmail.com")
		{
			return "valid gmail.com";
		}
		else {
			return "invalid";
		}
	}
	public String getPassword()
	{
		if(Password=="guru@99")
		{
			return "valid password";
		}
		else
		{
			return "invalid";
		}
}}
public class GmailUser {
	public static void main(String[] args) {
Gmail g=new Gmail();
g.setUsername("vcs@gmail.com");
g.setPassword("WEQ@123");
System.out.println(g.getUsername());
System.out.println(g.getPassword());

g.setUsername("abc@gmail.com");
g.setPassword("guru@99");
System.out.println(g.getUsername());
System.out.println(g.getPassword());
}}

