
package assignment_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDoublyLinkedList 
{
	
	// creating objects
	DoublyLinkedList<String> doublyLinkedList;

	@Before
	public void setUp() throws Exception 
	{
		doublyLinkedList = new DoublyLinkedList<String>();
	}

	@Test
	public void testAddAtIndex() 
	{
		assertEquals("test1",doublyLinkedList.add(0, "test1"));
		assertEquals("test2",doublyLinkedList.add(1, "test2"));
		assertEquals("test3",doublyLinkedList.add(2, "test3"));
		assertEquals("test4",doublyLinkedList.add(0, "test4"));
		
	}
	
	@Test
	public void testRemoveBasedOnValue() 
	{
		assertEquals("welcome",doublyLinkedList.add(0, "welcome"));
		assertEquals("you",doublyLinkedList.add(1, "you"));
		assertEquals("to",doublyLinkedList.add(2, "to"));

		assertEquals(true,doublyLinkedList.remove("welcome"));
		assertEquals(true,doublyLinkedList.remove("you"));
	}

	@Test
	public void testRemoveBasedOnIndex() 
	{
		
		assertEquals("welcome",doublyLinkedList.add(0, "welcome"));
		assertEquals("you",doublyLinkedList.add(1, "you"));
		assertEquals("to",doublyLinkedList.add(2, "to"));
		
		
		assertEquals(true,doublyLinkedList.remove(2));
		assertEquals(true,doublyLinkedList.remove(0));
	}

	@Test
	public void testGetElementBasedOnIndex() 
	{
		
		assertEquals("welcome",doublyLinkedList.add(0, "welcome"));
		assertEquals("you",doublyLinkedList.add(1, "you"));
		assertEquals("to",doublyLinkedList.add(2, "to"));
		
		assertEquals("welcome",doublyLinkedList.get(0));
		assertEquals("you",doublyLinkedList.get(1));
		
	}
}