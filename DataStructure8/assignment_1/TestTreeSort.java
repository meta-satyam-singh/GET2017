package assignment_1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class TestTreeSort 
{
	TreeSort treeSort;
	Node startNode = null;
	List<Integer> rollNumberList , expectedSortedRollNumberList;
	@Before
	public void setUp() throws Exception 
	{
		treeSort = new TreeSort();
		rollNumberList = new ArrayList<Integer>();
		rollNumberList.add(0,45);
		rollNumberList.add(1,30);
		rollNumberList.add(2,15);
		rollNumberList.add(3,2);
		
		expectedSortedRollNumberList = new ArrayList<Integer>();
		expectedSortedRollNumberList.add(0,2);
		expectedSortedRollNumberList.add(1,15);
		expectedSortedRollNumberList.add(2,30);
		expectedSortedRollNumberList.add(3,45);
		
	}
	@Test
	public void testGetSortedOrder()
	{
		startNode = treeSort.createBinarySearchTree(rollNumberList, startNode);
		List<Integer> actualSortedRollNumberList = new ArrayList<Integer>();		
		treeSort.getSortedOrder(startNode, actualSortedRollNumberList);
		assertEquals(expectedSortedRollNumberList , actualSortedRollNumberList);
	}

}
