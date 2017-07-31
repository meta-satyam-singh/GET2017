package oop4;
import java.util.Scanner;
public class SocialNetwork 
{

	private Graph graph;	//Graph to store the social network structure
	private Scanner scan;
	private CompositeMenuItem mainMenu;		//To provide the operations in the social network
	private Menu[] menuItems;	//The operations in the social network
	
	public SocialNetwork() 
	{
		graph = new Graph();
		scan = new Scanner(System.in);
		menuItems = new Menu[6];
	}
	
	
	 // Method to initialize the social network
	public void createNetwork() 
	{
		ReadNetwork read = new ReadNetwork();
	
		//Reading the node information
		graph = read.readNodes(graph,scan);
		//Reading the edge information
		graph = read.readConnections(graph, scan);
		//Displaying the initial social network
		graph.displayGraph();
	}
	
	
	//Method to create a menu for the available operations in the social network
	public void createMenu() 
	{
		//Creating the Menu items
		menuItems[0] = new MenuIsFriend( graph);
		menuItems[1] = new MenuEditProfile( graph);
		menuItems[2] = new MenuFriendRequest( graph);
		menuItems[3] = new MenuMutualFriend( graph);
		menuItems[4] = new MenuIsConnection( graph);
		menuItems[5] = new MenuDisplay( graph);
		
		//Adding the menu items
		mainMenu = new CompositeMenuItem(menuItems);
		//Display the main menu
		mainMenu.actionTaken(scan);
		scan.close();
	}
	
	public static void main(String[] args) 
	{
		SocialNetwork network = new SocialNetwork();
		network.createNetwork();
		network.createMenu();
	}
}
