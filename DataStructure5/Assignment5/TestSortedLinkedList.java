package Assignment5;
import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class TestSortedLinkedList 
{

	private static SortedLinkedList<Integer> linkedList;
	
	@Before
	public void setUp() 
	{
		linkedList = new SortedLinkedList<Integer>();
		linkedList.insert(5);
		linkedList.insert(2);
		linkedList.insert(7);
		linkedList.insert(9);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testInsert() 
	{
		 @SuppressWarnings("rawtypes")
		LinkedList expected = new LinkedList<Integer>();
		 expected.add(2);
		 expected.add(5);
		 expected.add(7);
		 expected.add(9);
		 expected.add(18);
		 assertEquals(expected ,linkedList.insert(18));
	}
	
	@Test
	public void testSize() 
	{
		assertEquals(4, linkedList.size());
	}
	
	@Test
	public void testGet()
	{
		Integer input;
		int[] expected = new int[] {2, 5, 7, 9};
		for(int i=0; i < linkedList.size(); i++) 
		{
			input = linkedList.get(i);
			assertEquals(new Integer (expected[i]), input);
		}
	}
}
