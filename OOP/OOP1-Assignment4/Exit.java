package oop6;

public class Exit extends Menu {
	private String Name ;
	public Exit(String Name)
	{
		this.Name = Name;
	}
	@Override
	public void actionTaken() 
	{
		System.exit(0);
	}

	@Override
	public void setName(String Name) 
	{
		this.Name = Name;
	}

	@Override
	public String getName() 
	{
		return Name;
	} 

}
