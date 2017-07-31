package oop4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompositeMenuItem extends Menu
{

	private String menuName;	//Menu name
	private List<Menu> menu;	//To store all the menu items for a composite menu
	
	public CompositeMenuItem() 
	{
		
	}
	
	public CompositeMenuItem(Menu[] menuItems) 
	{
		this.menuName = "Main Menu";
		menu = new ArrayList<Menu>((Arrays.asList(menuItems)));
		//for(int i=0; i < menuItems.length; i++) 
		//	menu.add(menuItems[i]);
	}
	
	@Override
	public void setName(String name) 
	{
		this.menuName = name;
	}

	@Override
	public String getName() 
	{
		return menuName;
	}

	@Override
	public void actionTaken(Scanner scan) 
	{
		int choice = 0;		//to get the menu choice from the user
		do {
			System.out.println("\n\n"+menuName+"\n");
			//loop to print the menu item list
			for(int i=1; i <= menu.size(); i++)
				System.out.println(i+". "+menu.get(i-1).getName());
			//Getting the menu choice from user
			System.out.println("Enter choice :");
			try
			{
				choice = Integer.parseInt(scan.nextLine());
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			//check if the menu number input is correct or not
			if((choice < 1) || (choice > menu.size())) 
				continue;
			else 
				menu.get(choice-1).actionTaken(scan);
			
			//checking for the back condition
			if(choice == menu.size()) 
				return;
		} while(true);
	}

}
