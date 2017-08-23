package assignment_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArrayList 
{
	
	// object of ArrayList class
	ArrayList<String> arrayList , sortedArrayList ;

	@Before
	public void setUp() throws Exception 
	{
		
		// initializing the object
		arrayList = new ArrayList<String>();
		
		sortedArrayList = new ArrayList<String>();
	}

	@Test
	public void testAddElement() 
	{
		
		assertEquals("hello",arrayList.add("hello"));
		assertEquals("my",arrayList.add("my"));
		assertEquals("name",arrayList.add("name"));
		assertEquals("is",arrayList.add("is"));
		assertEquals("Satyam",arrayList.add("Satyam"));
		
	}
	
	@Test
	public void testAddElementAtIndex() 
	{
		
		assertEquals("hello",arrayList.add(0,"hello"));
		assertEquals("my",arrayList.add(1,"my"));
		assertEquals("name",arrayList.add(2,"name"));
		assertEquals("is",arrayList.add(3,"is"));
		assertEquals("Satyam",arrayList.add(4,"Satyam"));
		
	}
	

	@Test
	public void testRemoveElementByValue() 
	{
		
		assertEquals("hello",arrayList.add("hello"));
		assertEquals("my",arrayList.add("my"));
		assertEquals("name",arrayList.add("name"));
		assertEquals("is",arrayList.add("is"));
		assertEquals("Satyam",arrayList.add("Satyam"));
		assertEquals(true,arrayList.remove("Satyam"));
		assertEquals(true,arrayList.remove("hello"));
		assertEquals(true,arrayList.remove("my"));
	}
	
	@Test
	public void testGetIndexOfElement() 
	{
		
		assertEquals("people",arrayList.add("people"));
		assertEquals("hello",arrayList.add("hello"));
		assertEquals(0,arrayList.getIndex("people"));
		assertEquals(1,arrayList.getIndex("hello"));
		
	}

	@Test
	public void testGetElementAtIndex() 
	{
		
		assertEquals("hello",arrayList.add("hello"));
		assertEquals("Satyam",arrayList.add("Satyam"));
		assertEquals("hello",arrayList.getElement(0));
		assertEquals("Satyam",arrayList.getElement(1));
	}
	
	@Test
	public void testOverWriteElement() 
	{
		
		assertEquals("people",arrayList.add("people"));
		assertEquals("hello",arrayList.add("hello"));
		assertEquals("test",arrayList.overwriteElement(0,"test"));
		
	}
	
	@Test
	public void testGrowCapacity() 
	{
		
		assertEquals("people",arrayList.add("people"));
		assertEquals("hello",arrayList.add("hello"));
		assertEquals(15,arrayList.growCapacity());
		
	}
		
	@Test
	public void testReverseList()
	{
		
		assertEquals("hello",arrayList.add("hello"));
		assertEquals("Satyam",arrayList.add("Satyam"));
		assertEquals("welcome",arrayList.add("welcome"));
		
		arrayList.reverseList();
		
		assertEquals("welcome",arrayList.getElement(0));
		assertEquals("Satyam",arrayList.getElement(1));
		assertEquals("hello",arrayList.getElement(2));
		
	}
	
	@Test
	public void testClearList() 
	{
		
		assertEquals(0, arrayList.clearList());
	}
	
	@Test
	public void testSortList()
	{
		
		assertEquals("def",arrayList.add("def"));
		assertEquals("cde",arrayList.add("cde"));
		assertEquals("bce",arrayList.add("bce"));
		assertEquals("abc",arrayList.add("abc"));
		
		arrayList.sort();
		
		assertEquals("abc",arrayList.getElement(0));
		assertEquals("bce",arrayList.getElement(1));
		assertEquals("cde",arrayList.getElement(2));
		assertEquals("def",arrayList.getElement(3));
		
		
	}

}