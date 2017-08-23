
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
	public void testAddByElement() 
	{
		
		assertEquals("welcome",singlyLinkedList.add( "welcome"));
		assertEquals("Satyam",singlyLinkedList.add("Satyam"));
		assertEquals("to",singlyLinkedList.add("to"));
	}
	
	@Test
	public void testAddAtIndex() 
	{
		
		assertEquals("welcome",singlyLinkedList.add(0, "welcome"));
		assertEquals("Satyam",singlyLinkedList.add(1, "Satyam"));
		assertEquals("to",singlyLinkedList.add(2, "to"));
	}
	
	@Test
	public void testRemoveByValue() 
	{
		
		assertEquals("welcome",singlyLinkedList.add(0, "welcome"));
		assertEquals("Satyam",singlyLinkedList.add(1, "Satyam"));
		assertEquals("to",singlyLinkedList.add(2, "to"));

		assertEquals(true,singlyLinkedList.remove("welcome"));
		assertEquals(true,singlyLinkedList.remove("Satyam"));
		assertEquals(true,singlyLinkedList.remove("to"));
	}

	@Test
	public void testRemoveByIndex() 
	{
		
		assertEquals("welcome",singlyLinkedList.add(0, "welcome"));
		assertEquals("Satyam",singlyLinkedList.add(1, "Satyam"));
		assertEquals("to",singlyLinkedList.add(2, "to"));
		assertEquals("Linked MergedList",singlyLinkedList.add(3, "Linked MergedList"));
		
		assertEquals(true,singlyLinkedList.remove(3));
	}
	
	@Test
	public void testReverseList()
	{
		
		assertEquals("hello",singlyLinkedList.add("hello"));
		assertEquals("Satyam",singlyLinkedList.add("Satyam"));
		assertEquals("welcome",singlyLinkedList.add("welcome"));
		
		singlyLinkedList.reverse();
		
		assertEquals("welcome",singlyLinkedList.get(0));
		assertEquals("Satyam",singlyLinkedList.get(1));
		assertEquals("hello",singlyLinkedList.get(2));
		
	}
	
	
	@Test
	public void testGetElementByIndex() 
	{
		
		assertEquals("this",singlyLinkedList.add(0, "this"));
		assertEquals("is",singlyLinkedList.add(1, "is"));
		assertEquals("Linked MergedList",singlyLinkedList.add(2, "Linked MergedList"));
		
		assertEquals("this",singlyLinkedList.get(0));
		assertEquals("is",singlyLinkedList.get(1));
		
	}
}