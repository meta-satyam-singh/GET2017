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
		
		assertEquals(true,arrayList.add("hello"));
		assertEquals(true,arrayList.add("my"));
		assertEquals(true,arrayList.add("name"));
		assertEquals(true,arrayList.add("is"));
		assertEquals(true,arrayList.add("Satyam"));
		assertEquals(true,arrayList.add("welcome"));
		assertEquals(true,arrayList.add("to"));
		assertEquals(true,arrayList.add("my"));
		assertEquals(true,arrayList.add("arrayList"));
		assertEquals(true,arrayList.add("end"));
		assertEquals(true,arrayList.add("of"));
		assertEquals(true,arrayList.add("program"));
		
	}
	
	@Test
	public void testAddElementAtIndex() 
	{
		
		assertEquals(true,arrayList.add(0,"hello"));
		assertEquals(true,arrayList.add(1,"my"));
		assertEquals(true,arrayList.add(2,"name"));
		assertEquals(true,arrayList.add(3,"is"));
		assertEquals(true,arrayList.add(4,"Satyam"));
		assertEquals(true,arrayList.add(5,"welcome"));
		assertEquals(true,arrayList.add(6,"to"));
		assertEquals(true,arrayList.add(7,"my"));
		assertEquals(true,arrayList.add(8,"arrayList"));
		assertEquals(true,arrayList.add(9,"end"));
		
	}
	
	@Test
	public void testRemoveElementByIndex() 
	{
		
		assertEquals(true,arrayList.remove(6));
		assertEquals(true,arrayList.remove(7));
		assertEquals(true,arrayList.remove(8));
		assertEquals(true,arrayList.remove(9));
		
	}

	@Test
	public void testRemoveElementByValue() 
	{
		
		assertEquals(true,arrayList.remove("Satyam"));
		assertEquals(true,arrayList.remove("hello"));
		assertEquals(true,arrayList.remove("is"));
		assertEquals(true,arrayList.remove("my"));
		
	}
	
	@Test
	public void testGetIndexOfElement() 
	{
		
		assertEquals(true,arrayList.add("people"));
		assertEquals(true,arrayList.add("hello"));
		assertEquals(0,arrayList.getIndex("people"));
		assertEquals(1,arrayList.getIndex("hello"));
		
	}

	@Test
	public void testGetElementAtIndex() 
	{
		
		assertEquals(true,arrayList.add("hello"));
		assertEquals(true,arrayList.add("Satyam"));
		assertEquals("hello",arrayList.getElement(0));
		assertEquals("Satyam",arrayList.getElement(1));
	}
		
	@Test
	public void testReverseList()
	{
		
		assertEquals(true,arrayList.add("hello"));
		assertEquals(true,arrayList.add("Satyam"));
		assertEquals(true,arrayList.add("welcome"));
		
		arrayList.reverseList();
		
		assertEquals("welcome",arrayList.getElement(0));
		assertEquals("Satyam",arrayList.getElement(1));
		assertEquals("hello",arrayList.getElement(2));
		
	}
	
	@Test
	public void testClearList() 
	{
		assertEquals(true, arrayList.clearList());
	}
	
	@Test
	public void testSortList()
	{
		
		sortedArrayList.add("abc");
		sortedArrayList.add("bce");
		sortedArrayList.add("cde");
		sortedArrayList.add("def");
		
		assertEquals(true,arrayList.add("def"));
		assertEquals(true,arrayList.add("cde"));
		assertEquals(true,arrayList.add("bce"));
		assertEquals(true,arrayList.add("abc"));
		
		arrayList.sort();
		
		assertEquals("abc",arrayList.getElement(0));
		assertEquals("bce",arrayList.getElement(1));
		assertEquals("cde",arrayList.getElement(2));
		assertEquals("def",arrayList.getElement(3));
		
		
	}

}