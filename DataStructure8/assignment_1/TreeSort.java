package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TreeSort 
{
	BufferedReader bufferedReader = null;
	public TreeSort()
	{
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) 
	{
		boolean flagToContinue = true;
		while(flagToContinue)
		{
			TreeSort treeSort = new TreeSort();
			try
			{
				Node startNode = null;
				List<Integer> studentRollNumberList = new ArrayList<Integer>();
				char userPermission = '\0';

				do
				{
					System.out.println("1. Add Student");
					int userChoice = treeSort.getUserIntegerInput("Please select a valid choice");
					switch(userChoice)
					{
						case 1:
							treeSort.addStudent(studentRollNumberList);
							break;
						default:
							System.out.println("Invalid Choice");

					}
					userPermission = treeSort.getUserStringInput("Press y or Y to continue").charAt(0);
				}while(userPermission == 'y' || userPermission =='Y');
				startNode = treeSort.createBinarySearchTree(studentRollNumberList, startNode);
				if(startNode != null)
				{
					List<Integer> sortedRollNumberList = new ArrayList<Integer>();
					System.out.println("Sorted Order according to roll number");
					treeSort.getSortedOrder(startNode , sortedRollNumberList);
					for (Integer rollNumber : sortedRollNumberList) 
						System.out.println(rollNumber);
				}

				else
					System.out.println("No student to display");
				flagToContinue = false;
			}
			catch(Exception ex)
			{
				System.out.println("Something went wrong: "+ex.getMessage()+" Program will restart");
			}
			finally
			{

				try 
				{
					treeSort.bufferedReader.close();
				}
				catch(Exception ex)
				{

					System.out.println("Something went wrong: "+ex.getMessage());
				}
			}
		}
		System.out.println("Program Ended");
	}
	public void addStudent(List<Integer> studentRollNumberList) 
	{
		boolean flag = true;
		while(flag)
		{
			try
			{
				int studentRollNumber = getUserIntegerInput("Please enter student roll number");
				studentRollNumberList.add(studentRollNumber);
				flag = false;
			}
			catch(Exception ex)
			{
				System.out.println("Something went wrong: "+ex.getMessage()+"Please add student again");
			}
		}
	}
	
	public Node createBinarySearchTree(List<Integer> rollNumberList , Node startNode)
	{
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		for(int loopVariable = 0 ; loopVariable < rollNumberList.size() ;++loopVariable)
			startNode = binarySearchTree.insertNode(startNode, rollNumberList.get(loopVariable));
		return startNode;
	}

	public void getSortedOrder(Node startNode , List<Integer> rollNumberList)
	{
		if(startNode != null)
		{
			getSortedOrder(startNode.left , rollNumberList);
			rollNumberList.add(startNode.nodeValue);
			getSortedOrder(startNode.right , rollNumberList);
		}
		
	}


	public int getUserIntegerInput(String message)
	{
		boolean flag = true;
		int userInput = 0;
		while(flag)
		{
			try
			{
				System.out.println(message);
				userInput = Integer.parseInt(bufferedReader.readLine());
				if(userInput >= 0)
					flag = false;

			}
			catch(Exception ex)
			{
				System.out.println("Something went wrong: "+ex.getMessage());
			}
		}

		return userInput;
	}

	public String getUserStringInput(String message)
	{			
		boolean flag = true;
		String userInput = null;
		while(flag)
		{
			try
			{
				System.out.println(message);
				userInput = bufferedReader.readLine();
				if(userInput.length() > 0)
					flag = false;

			}
			catch(Exception ex)
			{
				System.out.println("Something went wrong: "+ex.getMessage());
			}
		}
		return userInput;
	}
}