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
		output = restrictLength(output, 20);
		output += firstName;
		output = restrictLength(output, 40);
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
	
	public String restrictLength(String s, int index)
	{
		String output = s;
		if(output.length() > index)
		{
			output = output.substring(0, index - 3) + "...";
		}
		else
		{
			while(output.length() < index)
			{
				output += " ";
			}
		}
		return output;
	}
	
}
