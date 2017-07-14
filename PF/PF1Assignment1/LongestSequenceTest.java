
import static org.junit.Assert.*;

import org.junit.Test;

public class LongestSequenceTest {

	@Test
	public void noElement(){
		System.out.println("Test for no element in array");
		int[] input = {};
		int[] expected = LongestSequence.longestSequence(input);
		assertEquals("no  elements",input,expected);
	}
	
	@Test
	public void singleElement(){
		System.out.println("Test for single element in array");
		int[] input = {5};
		int[] expected = LongestSequence.longestSequence(input);
		assertEquals("one element",input,expected);
	}
	
	@Test
	public void validInput(){
		System.out.println("Test for valid array");
		int[] input = {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int[] result = LongestSequence.longestSequence(input);
		System.out.println(result.length);
		int[] expected = {1, 2,4,5,6,7,8,9};
		assertArrayEquals(expected,result);
	}

}
