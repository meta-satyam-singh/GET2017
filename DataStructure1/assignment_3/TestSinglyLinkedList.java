package assignment_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSinglyLinkedList 
{
	// declaring objects
	SinglyLinkedList<String> singlyLinkedList;
	@Before
	public void setUp() throws Exception
	{
		singlyLinkedList = new SinglyLinkedList<String>();
	}

	@Test
	public void testAddAtIndex() 
	{
		assertEquals(true,singlyLinkedList.add(0, "welcome"));
		assertEquals(true,singlyLinkedList.add(1, "Satyam"));
		assertEquals(true,singlyLinkedList.add(2, "to"));
		assertEquals(true,singlyLinkedList.add(3, "Linked MergedList"));
		
		
	}
	
	@Test
	public void testRemoveByValue() 
	{
		assertEquals(true,singlyLinkedList.add(0, "welcome"));
		assertEquals(true,singlyLinkedList.add(1, "Satyam"));
		assertEquals(true,singlyLinkedList.add(2, "to"));

		assertEquals(true,singlyLinkedList.remove("welcome"));
		assertEquals(true,singlyLinkedList.remove("Satyam"));
		assertEquals(true,singlyLinkedList.remove("to"));
	}

	@Test
	public void testRemoveByIndex() 
	{
		assertEquals(true,singlyLinkedList.add(0, "welcome"));
		assertEquals(true,singlyLinkedList.add(1, "Satyam"));
		assertEquals(true,singlyLinkedList.add(2, "to"));
		assertEquals(true,singlyLinkedList.add(3, "Linked MergedList"));
		assertEquals("Success",true,singlyLinkedList.remove(3));
	}
	@Test
	public void testGetElementByIndex() 
	{
		assertEquals(true,singlyLinkedList.add(0, "this"));
		assertEquals(true,singlyLinkedList.add(1, "is"));
		assertEquals(true,singlyLinkedList.add(2, "Linked MergedList"));
		
		assertEquals("this",singlyLinkedList.get(0));
		assertEquals("is",singlyLinkedList.get(1));
		
	}
}