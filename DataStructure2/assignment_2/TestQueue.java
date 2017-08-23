package assignment_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestQueue
{
	Queue<String> queue;
	@Before
	public void setUp() throws Exception 
	{	
		queue = new Queue<String>();
	}
	@Test
	public void testEnqueue() 
	{
		assertEquals("aaa",queue.enqueue("aaa"));
		assertEquals("bbb",queue.enqueue("bbb"));
		assertEquals("ccc",queue.enqueue("ccc"));
		assertEquals("ddd",queue.enqueue("ddd"));
		assertEquals("eee",queue.enqueue("eee"));
	}

	@Test
	public void testDequeue() 
	{
		assertEquals("aaa",queue.enqueue("aaa"));
		assertEquals("bbb",queue.enqueue("bbb"));
		assertEquals("ccc",queue.enqueue("ccc"));
		assertEquals("aaa",queue.dequeue());
		assertEquals("bbb",queue.dequeue());
		assertEquals("ccc",queue.dequeue());
	}

	@Test
	public void testMakeEmpty() 
	{
		assertEquals("aaa",queue.enqueue("aaa"));
		assertEquals("bbb",queue.enqueue("bbb"));
		assertEquals("ccc",queue.enqueue("ccc"));
		assertEquals(true,queue.makeEmpty());
	}

	@Test
	public void testGetFront() 
	{
		assertEquals("aaa",queue.enqueue("aaa"));
		assertEquals("bbb",queue.enqueue("bbb"));
		assertEquals("ccc",queue.enqueue("ccc"));
		assertEquals("aaa",queue.getFront());
	}

	@Test
	public void testIsEmpty() 
	{
		assertEquals("aaa",queue.enqueue("aaa"));
		assertEquals("Success",false,queue.isEmpty());
		assertEquals("aaa",queue.dequeue());
		assertEquals("Success",true,queue.isEmpty());
	}
	
	@Test
	public void testgetSize() 
	{
		assertEquals("aaa",queue.enqueue("aaa"));
		assertEquals("bbb",queue.enqueue("bbb"));
		assertEquals("ccc",queue.enqueue("ccc"));
		assertEquals(3,queue.getSize());
		assertEquals(true,queue.makeEmpty());
		assertEquals(0,queue.getSize());
		
	}
}