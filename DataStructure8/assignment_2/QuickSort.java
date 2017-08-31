package assignment_2;

public class QuickSort 
{
	public int[] doQuickSort(int[] array , int start,int end)
	{
		//condition to check to call this method again 
		if(start < end)
		{
			// here the partitionIndex is computed which is the index of correctly placed element in array
			int partitionIndex = partition(array,start,end);
			// calling the same method from start to partitionIndex-1 to sort the left array 
			doQuickSort(array , start , partitionIndex - 1);
			// calling the same method from partitionIndex+1 to end to sort the right array
			doQuickSort(array , partitionIndex + 1 , end);
		}

		// returning sorted array
		return array;
	}

	public int partition(int[] array,int start,int end)
	{

		// taking pivot element as start element of array
		int pivot = array[start];
		
		// a variable called partitionIndex which will be used to signify the correct position of pivot element
		int partitionIndex = start + 1;

		// correct position is computed by traversing the whole array
		for(int i = start+1 ; i <= end ; ++i)
		{

			if(pivot > array[i])
			{
				swap(array,partitionIndex,i);
				partitionIndex++ ;
			}
		}
		swap(array,partitionIndex - 1,start);
		
		// correct position is returned
		return (partitionIndex - 1);
	}

	public void swap(int[] array,int index1,int index2)
	{

		// temp is temporary variable
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}