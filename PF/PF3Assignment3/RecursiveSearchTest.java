package PF3;
import static org.junit.Assert.*;
import org.junit.Test;
public class RecursiveSearchTest {
	// searches for element that doesn't exist
	@Test
	public void testLinearSearch1() {
		int[] input = {2,5,8,9,10,77,55};
		boolean result = false;
		RecursiveSearch r = new RecursiveSearch();
		boolean expected = r.linearSearch(input, 88, 0);
		assertEquals(expected, result);
	}
	// searches for element that exists
	@Test
	public void testLinearSearch2() {
		int[] input = {2,5,8,9,10,77,55};
		boolean result = true;
		boolean expected = new RecursiveSearch().linearSearch(input, 77, 0);
		assertEquals(expected, result);
	}
	@Test
	public void testBinarySearch1() {
		int[] input = {2,5,8,9,10,55,77};
		boolean result = false;
		boolean expected =  new RecursiveSearch().binarySearch(input,0,input.length-1,88);
		assertEquals(expected, result);
	}
	@Test
	public void testBinarySearch2() {
		int[] input = {2,5,8,9,10,55,77};
		boolean result = true;
		boolean expected =  new RecursiveSearch().binarySearch(input,0,input.length-1,77);
		assertEquals(expected, result);
	}
}
