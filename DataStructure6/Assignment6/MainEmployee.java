package Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainEmployee 
{

	private HashMap<String, Employee> employees;	
	private Employee details;	
	private Scanner scan;	
	private List<String> keys;	
	
	public MainEmployee() 
	{
		employees = new HashMap<String, Employee>();
		keys = new ArrayList<String>();
		scan = new Scanner(System.in);
	}
	
	public void getDetails() 
	{
		String choice;	
		String name = "";		
		String id = "";			
		String address = "";
		do 
		{
			do 
			{
				System.out.println("Enter ID");
				id = scan.nextLine();
				if(employees.containsKey(id.toLowerCase())) 
				{
					System.out.println("ID already exist");
					continue;
				}
				System.out.println("Enter name");
				name = scan.nextLine();
				System.out.println("Enter address");
				address = scan.nextLine();
			} while(employees.containsKey(id.toLowerCase()));
			details = new Employee(id, name, address);
			employees.put(id.toLowerCase(), details);
			keys.add(id.toLowerCase());
			System.out.println("Enter more employee details [y/n] :");
			choice = scan.nextLine();
		} while (choice.equalsIgnoreCase("y"));
	}

	public void display() 
	{
		List<Employee> objects = new ArrayList<Employee>();
		for(int i=0; i < keys.size(); i++)
			objects.add(employees.get(keys.get(i)));
		System.out.println("\nSorting in natural order");
		Collections.sort(objects);
		for(Employee e: objects) 
			System.out.println(e);
		System.out.println("\nSorting on the basis of name");
		Collections.sort(objects, new NameComparator());
		for(Employee e: objects) 
			System.out.println(e);
	}
	
	public static void main(String[] args) 
	{
		MainEmployee mainEmployee = new MainEmployee();
		mainEmployee.getDetails();
		mainEmployee.display();
	}

}