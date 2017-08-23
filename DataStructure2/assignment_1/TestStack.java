
package assignment_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStack {
	
	Stack<String> stack ;

	@Before
	public void setUp() throws Exception {
		
		stack = new Stack<String>();
	}

	@Test
	public void testPush() {
		
		assertEquals("aaa",stack.push("aaa"));
		assertEquals("bbb",stack.push("bbb"));
		
	}

	@Test
	public void testPop() {
		
		assertEquals("aaa",stack.push("aaa"));
		assertEquals("bbb",stack.push("bbb"));
		assertEquals("bbb",stack.pop());
		
	}

	@Test
	public void testGetTop() {
		
		assertEquals("aaa",stack.push("aaa"));
		assertEquals("bbb",stack.push("bbb"));
		assertEquals("bbb",stack.getTop());
	}

	@Test
	public void testIsEmpty() {
		
		assertEquals("ccc",stack.push("ccc"));
		assertEquals(false,stack.isEmpty());
		assertEquals("ccc",stack.pop());
		assertEquals(true,stack.isEmpty());
	}

	@Test
	public void testgetSize() {
		
		assertEquals("ccc",stack.push("ccc"));
		assertEquals("ddd",stack.push("ddd"));
		assertEquals(2,stack.getSize());
		
	}

}