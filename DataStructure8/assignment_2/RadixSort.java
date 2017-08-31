package assignment_2;

import java.util.Arrays;

// class to define radix sort
public class RadixSort 
{

	public int[] doRadixSort(int[] array) 
	{
		// variable to store largest number from arrau
		int largestNumber = getLargestNumber(array);

		// variable for exponent
		int exponent = 1;

		// until all digits of largest number are traversed
		while (largestNumber != 0) 
		{

			// count sort is called
			array = countSort(array, exponent);

			// largest number is divided by 10
			largestNumber /= 10;

			// multiply exponent by 10
			exponent *= 10;
		}

		return array;
	}

	public int[] countSort(int[] array, int exponent) 
	{
		// output array to store the result
		int[] outputArray = new int[array.length];

		// countArray to store the count of each number
		int[] countArray = new int[10];

		// fill count array with zeros
		Arrays.fill(countArray, 0);

		// divide each array element by exponent,take its modulo by 10 to get each digit and increment 
		// its count by one
		for (int loopVariable = 0; loopVariable < array.length; ++loopVariable) 
			countArray[(array[loopVariable] / exponent) % 10]++;
		
		// add each count to previous one
		for (int loopVariable = 1; loopVariable < 10; ++loopVariable) 
			countArray[loopVariable] += countArray[loopVariable - 1];

		// start array from last and set each element to its count and decrement count by 1
		for (int loopVariable = array.length - 1; loopVariable >= 0; --loopVariable) 
			outputArray[--countArray[(array[loopVariable] / exponent) % 10]] = array[loopVariable];

		return outputArray;
	}

	public int getLargestNumber(int[] array) 
	{
		int largestNumber = 0;
		for (int i = 0; i < array.length; ++i) 
		{
			if (array[i] > largestNumber) 
				largestNumber = array[i];
		}
		return largestNumber;
	}
}