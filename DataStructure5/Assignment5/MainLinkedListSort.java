package Assignment5;

import java.util.Scanner;

public class MainLinkedListSort 
{

	private SortedLinkedList<Integer> list;	
	private Scanner scan;	
	
	public MainLinkedListSort() 
	{
		list = new SortedLinkedList<Integer>();
		scan = new Scanner(System.in);
	}
	
	public void insertList() 
	{
		String choice;	
		int number;		
		do 
		{
			try 
			{
				System.out.println("Enter number");
				number = Integer.parseInt(scan.nextLine());
				list.insert(number);
			} 
			catch (Exception e) 
			{
				System.out.println("Enter numbers only");
			}
			
			System.out.println("Do you want to add more [y/n] :");
			choice = scan.nextLine();
			display();
		} while (choice.equalsIgnoreCase("y"));
	}
	
	public void display() 
	{
		System.out.println("The sorted linked list is");
		for(int i=0; i < list.size(); i++) 
		{
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		MainLinkedListSort sorted = new MainLinkedListSort();
		sorted.insertList();
	}
}
