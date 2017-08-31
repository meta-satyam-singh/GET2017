
package assignment_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestQuickSort 
{
	
	QuickSort quickSort;
	int[] array1,array2,array3;
	int[] sortedArray1;

	@Before
	public void setUp() throws Exception 
	{
		
		quickSort = new QuickSort();
		
		array1 = new int[]{805,453,90,1,45,32,87,46,33};
		array2 = new int[]{4,4,4,4,4,4,4,4,4,4,4,4};
		array3 = new int[]{10,20,30,40,50,60,70};
		
		sortedArray1 = new int[]{1,32,33,45,46,87,90,453,805};
		
	}

	@Test
	public void test() 
	{
		
		assertArrayEquals(sortedArray1, quickSort.doQuickSort(array1,0,array1.length-1));
		assertArrayEquals(array2 , quickSort.doQuickSort(array2, 0,array2.length-1));
		assertArrayEquals(array3, quickSort.doQuickSort(array3, 0, array3.length-1));
	}

}
