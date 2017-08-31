package assignment_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestRadixSort 
{
	
	RadixSort radixSort;
	
	int[] array1,array2,array3;
	int[] sortedArray1;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		
		radixSort = new RadixSort();
		
		array1 = new int[]{805,453,90,1,45,32,87,46,33};
		array2 = new int[]{4,4,4,4,4,4,4,4,4,4,4,4};
		array3 = new int[]{10,20,30,40,50,60,70};
		
		sortedArray1 = new int[]{1,32,33,45,46,87,90,453,805};
		
	}

	/**
	 * Test method for {@link assignment_2.RadixSort#doRadixSort(int[])}.
	 */
	@Test
	public void testDoRadixSort() 
	{
		
		assertArrayEquals(sortedArray1,radixSort.doRadixSort(array1));
		assertArrayEquals(array2, radixSort.doRadixSort(array2));
		assertArrayEquals(array3, radixSort.doRadixSort(array3));
	}

}
