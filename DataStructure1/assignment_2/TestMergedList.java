
package assignment_2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import assignment_1.ArrayList;

public class TestMergedList 
{
	
	// object of mergedList class
	MergedList mergedList ;
	
	// array lists
	ArrayList<Integer> arrayList1 , arrayList2, expectedMergedList,actualMergedList;

	@Before
	public void setUp() 
	{
		mergedList = new MergedList();
		arrayList1 = new ArrayList<Integer>();
		arrayList2 = new ArrayList<Integer>();
		expectedMergedList = new ArrayList<Integer>();
		actualMergedList = new ArrayList<Integer>();
		// adding element in list 1
		for(int i = 2 ; i <= 5 ; ++i)
		{
			arrayList1.add(i);
		}
		// adding element in list 2
		for(int i = 6; i <= 8 ; ++i)
		{
			arrayList2.add(i);
		}
		
		// creating the expected list
		for(int i = 2 ; i <= 8; ++i)
		{
			expectedMergedList.add(i);
		}
	}

	@Test
	public void testMergeList() 
	{
		
		actualMergedList = mergedList.mergeList(arrayList1, arrayList2);
		
		assertEquals(expectedMergedList.getElement(0) , actualMergedList.getElement(0));
		assertEquals(expectedMergedList.getElement(1) , actualMergedList.getElement(1));
		assertEquals(expectedMergedList.getElement(2) , actualMergedList.getElement(2));
		assertEquals(expectedMergedList.getElement(3) , actualMergedList.getElement(3));
		assertEquals(expectedMergedList.getElement(4) , actualMergedList.getElement(4));
		assertEquals(expectedMergedList.getElement(5) , actualMergedList.getElement(5));
		assertEquals(expectedMergedList.getElement(6) , actualMergedList.getElement(6));
		
	}
}