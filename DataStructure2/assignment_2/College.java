package assignment_2;

public class College 
{
	private String collegeName;
	private int collegeRank , collegeSeats;
	
	public College(String collegeName , int collegeRank , int collegeSeats)
	{
		this.collegeName = collegeName;
		this.collegeRank = collegeRank;
		this.collegeSeats = collegeSeats;
	}
	public void setCollegeName(String collegeName)
	{
		this.collegeName = collegeName;
	}
	
	public String getCollegeName()
	{
		return this.collegeName;
	}

	public void setCollegeRank(int collegeRank)
	{
		this.collegeRank = collegeRank;
	}

	public int getCollegeRank()
	{
		return this.collegeRank;
	}
	
	public void setCollegeSeats(int collegeSeats)
	{
		this.collegeSeats = collegeSeats;
	}
	
	public int getCollegeSeats()	
	{
		return this.collegeSeats;
	}
}