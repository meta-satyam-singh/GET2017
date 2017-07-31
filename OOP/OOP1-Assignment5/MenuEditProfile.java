package oop4;

import java.util.Scanner;


public class MenuEditProfile extends CompositeMenuItem 
{

	private Graph graph;	//The social network on which the operation is to be performed
	
	public MenuEditProfile(Graph graph) 
	{
		this.setName("Edit Profile");
		this.graph = graph;
	}
	
	@Override
	public void actionTaken(Scanner scan) 
	{
		String name;
		Node node;
		
		do
		{
		//Getting the name of the node to edit
		System.out.println("\nEnter the profile name");
		name = scan.nextLine();
		if((node = graph.getNode(name)) != null)
			break;
	
		}while(true);
		
		//Editing the name attribute for the node
		System.out.println("Enter new name");
		name = scan.nextLine();
		//Updating the profile for node
		node.setName(name);
		
		//Editing the place attribute for the node
		System.out.println("Enter new place");
		name = scan.nextLine();
		//Updating the profile for node
		node.setPlace(name);
		
		System.out.println("Updation successfull");
	}
}
