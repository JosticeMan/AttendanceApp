package main;

public class Student implements Attendee {
	
	private String firstName;
	private String lastName;
	private boolean isPresent;
	
	public Student(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
		isPresent = false;
	}
	
	public boolean isPresent() 
	{
		return isPresent;
	}
	
	public void setPresent(boolean present)
	{
		isPresent = present;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public boolean mathces(String first, String last)
	{
		return first.equalsIgnoreCase(firstName) && last.equalsIgnoreCase(lastName);
	}
	
	public boolean matches(String last)
	{
		return last.equalsIgnoreCase(lastName);
	}
	
	public String getReportString()
	{
		String output = lastName;
		while(output.length() < 20)
		{
			output += " ";
		}
		output += firstName;
		while(output.length() < 40)
		{
			output += " ";
		}
		if(isPresent)
		{
			output += "Present" + "\n";
		}
		else
		{
			output += "Absent" + "\n";
		}
		return output;
	}
	
}
