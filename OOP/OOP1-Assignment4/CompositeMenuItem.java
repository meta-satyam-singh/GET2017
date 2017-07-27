package oop6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompositeMenuItem extends Menu{

	private String menuName;	//Menu name
	private List<Menu> menu;	//To store all the menu items for a composite menu
	
	public CompositeMenuItem() {
		menu = new ArrayList<Menu>();
	}
	
	public CompositeMenuItem(String name) 
	{
		this.menuName = name;
		menu = new ArrayList<Menu>();
	}
	
	public CompositeMenuItem(String name, Menu[] menuItems) 
	{
		this.menuName = name;
		menu = new ArrayList<Menu>();
		for(int i=0; i < menuItems.length; i++) 
			menu.add(menuItems[i]);
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
	public void actionTaken() 
	{
		// TODO Auto-generated method stub
		int choice = 0;		//to get the menu choice from the user
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("\n\n"+menuName+"\n");
			//loop to print the menu item list
			for(int i = 1; i <= menu.size(); i++)
				System.out.println(i+". "+menu.get(i-1).getName());
			
			//Getting the menu choice from user
			System.out.println("Enter choice :");
			try 
			{
			choice = scan.nextInt();
			scan.nextLine();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			//check if the menu number input is correct or not
			if((choice < 1) || (choice > menu.size())) 
				break;
			else 
				menu.get(choice-1).actionTaken();
			
			//checking for the back condition
			if(choice == menu.size()) 
				return;
		} while(true);
	}

}
