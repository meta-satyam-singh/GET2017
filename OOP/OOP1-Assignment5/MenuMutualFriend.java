package oop4;
import java.util.Scanner;
public class MenuMutualFriend extends CompositeMenuItem {

	private Graph graph;	//The social network on which the operation is to be performed
	
	public MenuMutualFriend(Graph graph) 
	{
		this.setName("Mutual Friend");
		this.graph = graph;
	}
	
	//@Override
	public void actionTaken(Scanner scan) 
	{
		Node requester;
		Node query;
		
		System.out.println("Enter profile name of requester");
		//Checking if the requesting node exist
		if((requester = graph.getNode(scan.nextLine())) == null) 
		{
			System.out.println("No such entity is present");
			return;
		}
		
		System.out.println("Enter the profile name to search mutual friends with");
		//Checking if the node queried for exist
		if((query = graph.getNode(scan.nextLine())) == null) 
		{
			System.out.println("No such entity is present");
			return;
		}
		
		System.out.println("Mutual friends are :");
		//Loop to iterate over all the neighbours of the requesting node
		for (Node n : requester.getNeighbours())
		{
			//Checking if the neighbour node is also a neighbour of the queried node
			if(query.isFriend(n)) 
				System.out.println(n.getName()+" ");
		}
	}
}
