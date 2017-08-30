
import java.util.Scanner;

public class BinarySearch 
{
	private int[] array;
	private static Scanner scan = new Scanner(System.in);
	
	public BinarySearch(int size) 
	{
		array = new int[size];
		System.out.println("size : " + size);
	}
	
	public BinarySearch(int size, int[] values) 
	{
		array = values;
	}
	
	public int inputNumberArray(int size) 
	{
		int item;	
		System.out.println("Enter "+size+" numbers in sorted manner");
		for(int i=0; i < size;) {
			try 
			{
				int x = Integer.parseInt(scan.nextLine());
				if(i == 0) 
				{
					array[i] = x ;
					i++;
					System.out.println("array at "+(i-1)+" value : "+ array[i-1]);
				}
				else if(x >= array[i-1]) 
				{
					array[i] = x ;
					i++;
					System.out.println("array at "+(i-1)+" value : "+ array[i-1]);
				}
				else
					System.out.println("numbers is not in sorted manner");
			} 
			catch (Exception e) 
			{
				System.out.println("Enter number only");
			}
		}
		
		System.out.println("Enter number to be searched");
		do 
		{
			try 
			{
				item = Integer.parseInt(scan.nextLine());
				break; 
			} 
			catch (Exception e) 
			{
				System.out.println("Enter number only");
			}
		} while(true);
		
		scan.close();
		return item;
	}
	
	public int performBinarySearch(int item, int low, int high) 
	{
		int mid = (low + high)/ 2;
		int temp;
		if(low > high) 
		{
			return -1;
		}
		if(item == array[mid]) 
		{
			temp = performBinarySearch(item, low, mid -1);
			if(temp == -1) 
			{
				return mid;
			} 
			else 
			{
				return temp;
			}
		} 
		else 
		{
			if(item < array[mid]) 
				return performBinarySearch(item, low, mid - 1);
			else 
				return performBinarySearch(item, mid + 1, high);
		}
	}
	
	public static void main(String[] args) 
	{
		int element;
		int location;
		System.out.println("Enter size of array");
		int size = scan.nextInt();
		scan.nextLine();
		BinarySearch searching = new BinarySearch(size);
		element = searching.inputNumberArray(size);
		location = searching.performBinarySearch(element, 0, size-1);
		if(location == -1) 
			System.out.println("Element does not exist in the list");
		else 
			System.out.println("Left most occurance is at index "+ location);
	}
}