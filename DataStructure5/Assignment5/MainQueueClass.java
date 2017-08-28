package Assignment5;

import java.util.Scanner;

public class MainQueueClass 
{
	private QueueImplementation<Integer> queue;	
	private Scanner scan;	
	
	public MainQueueClass() 
	{
		queue = new QueueImplementation<Integer>();
		scan = new Scanner(System.in);
	}
	
	public void operation() 
	{
		int choice;		
		int value;		
		do 
		{
			choice = 0;
			System.out.println("\n1. Insert into queue");
			System.out.println("2. Delete from queue");
			System.out.println("3. Get front element from queue");
			System.out.println("4. Exit");
			System.out.println("Enter choice:");
			try 
			{
				choice = Integer.parseInt(scan.nextLine());
				switch (choice) 
				{
				case 1:
					System.out.println("\nEnter number to add");
					try 
					{
						value = Integer.parseInt(scan.nextLine());
						queue.enqueue(value);
					} 
					catch (Exception e) 
					{
						System.out.println("\nEnter numbers only");
					}
					break;
				case 2:
					try 
					{
						System.out.println("\nDeleted value is: "+queue.dequeue());
					} 
					catch (Exception e) 
					{
						System.out.println("\nQueue underflow");
					}
					break;
				case 3:
					try 
					{
						System.out.println("\nThe value at the front is: "+queue.getFront());
					}
					catch (Exception e) 
					{
						System.out.println("\nQueue underflow condition");
					}
					break;
				case 4:
					break;
				default:
					System.out.println("Enter correct choice");
				}
				
			} 
			catch (Exception e) 
			{
				System.out.println("Enter numerals only");
			}
		} while (choice != 4);
	}
	
	public static void main(String[] args) 
	{
		MainQueueClass queueClass = new MainQueueClass();
		queueClass.operation();
	}
}
