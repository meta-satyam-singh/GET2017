package oop4;

import java.util.Scanner;

public class MenuDisplay extends CompositeMenuItem{

	private Graph graph;	//The social network on which the operation is to be performed
	
	public MenuDisplay(Graph graph) 
	{
		this.setName("Display");
		this.graph = graph;
	}
	
	@Override
	public void actionTaken(Scanner scan) 
	{
		//Displaying the current structure of the social network
		graph.displayGraph();
	}
}
