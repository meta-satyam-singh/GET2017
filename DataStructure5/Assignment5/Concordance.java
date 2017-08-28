package Assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Concordance 
{
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		new Concordance().concordanceFunction();
	}
	public HashMap<Character,ArrayList<Integer>> concordanceFunction()
	{
		System.out.println("Enter the Strng :");
		String input = scan.nextLine();
		input = input.toLowerCase();
		ArrayList<Integer> indexArray;
		HashMap<Character,ArrayList<Integer>> hm=new HashMap<Character,ArrayList<Integer>>();
		int countOfSpace = 0 ; 
		for(int i = 0 ; i<input.length(); i++) 
		{
			if(input.charAt(i) == 32) 
			{
				countOfSpace++;
				continue;
			}
			if(hm.get(input.charAt(i)) == null) 
			{
				indexArray = new ArrayList<Integer>();
				indexArray.add(i-countOfSpace);
				hm.put(input.charAt(i), indexArray);
			}
			else 
			{
				indexArray = hm.get(input.charAt(i));
				indexArray.add(i - countOfSpace);
				hm.put(input.charAt(i), indexArray);
			}
		}
		for (Map.Entry m:hm.entrySet())
	          System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
		return hm;
	}
}
