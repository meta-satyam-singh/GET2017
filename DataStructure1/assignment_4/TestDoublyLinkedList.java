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
		assertEquals(true,doublyLinkedList.add(0, "test1"));
		assertEquals(true,doublyLinkedList.add(1, "test2"));
		assertEquals(true,doublyLinkedList.add(2, "test3"));
		assertEquals(true,doublyLinkedList.add(0, "test4"));
	}
	
	@Test
	public void testRemoveBasedOnValue() 
	{
		assertEquals(true,doublyLinkedList.add(0, "welcome"));
		assertEquals(true,doublyLinkedList.add(1, "you"));
		assertEquals(true,doublyLinkedList.add(2, "to"));
		assertEquals(true,doublyLinkedList.remove("welcome"));
		assertEquals(true,doublyLinkedList.remove("you"));
	}

	@Test
	public void testRemoveBasedOnIndex() 
	{
		assertEquals(true,doublyLinkedList.add(0, "welcomes"));
		assertEquals(true,doublyLinkedList.add(1, "you"));
		assertEquals(true,doublyLinkedList.add(2, "to"));
		assertEquals(true,doublyLinkedList.add(3, "Linked MergedList"));
		assertEquals(true,doublyLinkedList.remove(3));
		assertEquals(true,doublyLinkedList.remove(0));
	}

	@Test
	public void testGetElementBasedOnIndex() 
	{
		
		assertEquals(true,doublyLinkedList.add(0, "this"));
		assertEquals(true,doublyLinkedList.add(1, "is"));
		assertEquals(true,doublyLinkedList.add(2, "Linked MergedList"));
		assertEquals("this",doublyLinkedList.get(0));
		assertEquals("is",doublyLinkedList.get(1));
		
	}
}