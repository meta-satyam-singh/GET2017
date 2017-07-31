package oop4;

import java.util.Scanner;

public class MenuIsFriend extends CompositeMenuItem
{

	private Graph graph;	//The social network on which the operation is to be performed
	
	public MenuIsFriend(Graph graph) 
	{
		this.setName("Is Friend");
		this.graph = graph;
	}
	
	@Override
	public void actionTaken(Scanner scan) 
	{
		Node query;
		Node requester;
		
		System.out.println("\nEnter the profile name for requester");
		//Checking if the requesting node exist
		if((requester = graph.getNode(scan.nextLine())) == null) 
		{
			System.out.println("No such entity is present");
			return;
		}
		
		System.out.println("Enter the profile name to search as a friend");
		//Checking if the node queried for exist
		if((query = graph.getNode(scan.nextLine())) == null) 
		{
			System.out.println("No such entity is present");
			return;
		}
		
		//Checking if the queried node is a friend for the requester node
		if(requester.isFriend(query)) 
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}
