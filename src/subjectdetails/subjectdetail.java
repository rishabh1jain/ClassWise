package subjectdetails;

public class subjectdetail {
	String name;
	String venue;
	String time;
	
	public subjectdetail(String name, String venue, String time)
	{
		this.name = name;
		this.venue = venue;
		this.time = time;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getVenue()
	{
		return this.venue;
	}
	
	public String getTime()
	{
		return this.time;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setVenue(String venue)
	{
		this.venue = venue;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}

}
