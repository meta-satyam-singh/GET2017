package assignment_2;


public class CountingSort 
{
	
	public int[] doCountingSort(int[] array)
	{
		int RANGE = 99;
		int[] count = new int[RANGE + 1];
		int[] output = new int[array.length] ;
	    for(int i = 0; i < array.length ; ++i)
	        ++count[array[i]];
	    for (int i = 1; i <= RANGE; ++i)
	        count[i] += count[i-1];
	    for (int i = 0; i < array.length; ++i)
	    {
	        output[count[array[i]]-1] = array[i];
	        --count[array[i]];
	    }
	 
	    return output;
	}
}