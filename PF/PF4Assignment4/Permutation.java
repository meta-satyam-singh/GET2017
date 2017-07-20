package pf4;
import java.util.ArrayList;
import java.util.List;
public class Permutation 
{
	// This Function gets all the combination of a given String input
	// And give output as List
	public List<String> getPermutations(String input, List<String> outputList)
	{
		if (outputList.contains(input)) 
			return outputList; 
		else 
			outputList.add(input);
		String combination = "";
		int inputLength = input.length();
		String lastCharacter =new Character( input.charAt(inputLength - 1)).toString();
		// Picking the last element of string placing it to different locations. 
		for (int index = inputLength - 2; index >= 0; index--) 
		{
			String firstPart = input.substring(0, index);
			String lastPart = input.substring(index, inputLength - 1);
			combination = firstPart + lastCharacter + lastPart;
			getPermutations(combination,outputList);
		}
		return outputList;
	}
	public List<String> generatePermutations(String input)
	{
		List<String> output = new ArrayList<String>();
		getPermutations(input, output);
		for(String string : output)
		{
			System.out.println(string);
		}
		return output;
	}
}