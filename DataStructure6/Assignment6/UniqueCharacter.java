package Assignment6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class UniqueCharacter 
{

	private HashMap<String, Integer> characterUnique;	
	private TreeSet<Character> characters;	
	private Scanner scan;	
	
	public UniqueCharacter() 
	{
		characterUnique = new HashMap<String, Integer>();
		scan = new Scanner(System.in);
	}
	
	public int countUniqueCharacter(String value) 
	{
		char ch;
		if(characterUnique.containsKey(value)) 
		{
			System.out.println("String repeated");
			return characterUnique.get(value);
		}
		characters = new TreeSet<Character>();
		for(int i=0; i < value.length(); i++) 
		{
			ch = value.charAt(i);
			characters.add(ch);
		}
		characterUnique.put(value, characters.size());
		return characters.size();
	}
	
	private void takeInput() 
	{
		String choice;
		do 
		{
			System.out.println("Enter the string to count the unique character");
			System.out.println("Unique characters: "+countUniqueCharacter(scan.nextLine()));
			System.out.println("Do you wish to enter more string [y/n] :");
			choice = scan.nextLine();
		} while (choice.equalsIgnoreCase("y"));
		scan.close();
	}
	
	public static void main(String[] args) 
	{
		UniqueCharacter unique = new UniqueCharacter();
		unique.takeInput();
	}
}