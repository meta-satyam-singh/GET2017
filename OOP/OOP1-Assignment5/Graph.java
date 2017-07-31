
package oop4;

import java.util.LinkedList;
import java.util.List;

public class Graph 
{

	private List<Node> vertices;	//Vertices in the graph
	
	public Graph()
	{
		vertices = new LinkedList<Node>();
	}
	
	public boolean addNode(Node node) 
	{
		//Adding a node
		if(vertices.add(node)) 
			return true;
		else 
			return false;
	}
	
	
	public Node getNode(String name) 
	{
		for(int i=0; i < vertices.size(); i++)
		{
			//Checking if the name is associated with the node
			if(vertices.get(i).getName().equalsIgnoreCase(name)) 
				return vertices.get(i);
		}
		
		return null;
	}
	
	public void displayGraph() 
	{
		System.out.println("Entity\tFriends\t\tPlace\tType");
		
		for(int i=0; i < vertices.size(); i++) 
		{
			//Printing each node
			System.out.print(vertices.get(i).getName()+"\t");
			//Printing the neighbour of the vertices
			vertices.get(i).displayNeighbour();
			//Printing the place attribute of the node
			System.out.print("\t"+vertices.get(i).getPlace());
			//Printing the type of the node
			System.out.println("\t"+vertices.get(i).getType());
		}
	}
	
}
