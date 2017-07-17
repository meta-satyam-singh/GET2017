

public class LongestSequence {
	public int[] longestSequence(int input[])
	{
		int i = 0, j = 0, k = 0, max = 0, start = 0, last = 0;
		int length = input.length;
		if (length==0 || length==1)
            		return input;
		for(i=0; i<input.length-1; i++)
		{
			if(input[i] < input[i+1])
			{
				k++;
			}
			else
			{
				if( k > max )
				{
					start = j;
					last = i;
					max = k;
				}
				j = i+1;
				k = 0;
			}
		}
		if( k > max ){
			start = j;
			last = i;
			max = k;
		}
		
		int resultArr[] = new int[max+1];
		for( i=start, k=0; i<=last; i++, k++)
		{
			resultArr[k] = input[i];
		}
		return resultArr;
	}
}
