package main;

public class Student implements Attendee {
	
	private String firstName;
	private String lastName;
	private boolean isPresent = false;
	
	public Student(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
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
			if(isPresent)
			{
				output += "Present";
			}
			else
			{
				output += "Absent";
			}
		}
		return output;
	}
	
}
