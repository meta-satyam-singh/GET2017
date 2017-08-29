package Assignment6;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> 
{
	//Method to perform the sorting based on the employee name
	@Override
	public int compare(Employee o1, Employee o2) 
	{
		return o1.getName().compareTo(o2.getName());
	}
	
}