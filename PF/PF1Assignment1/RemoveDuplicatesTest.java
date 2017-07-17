
import static org.junit.Assert.*;
import org.junit.Test;
public class RemoveDuplicatesTest {
	@Test
	public void noElement(){
		System.out.println("Test for no element in array");
		int[] input = {};
		RemoveDuplicates r = new RemoveDuplicates();
		int[] expected = r.removeDuplicates(input);
		assertEquals("no  elements",expected,expected);
	}
	@Test
	public void singleElement(){
		System.out.println("Test for single element in array");
		int[] input = {5};
		RemoveDuplicates r = new RemoveDuplicates();
		int[] expected = r.removeDuplicates(input);
		assertEquals("one element",expected,expected);
	}
	@Test
	public void validInput(){
		System.out.println("Test for valid array");
		int[] input = {2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		RemoveDuplicates r = new RemoveDuplicates();
		int[] expected = r.removeDuplicates(input);
		int[] expected = {0,2,3,4,5,6,8,9};
		assertArrayEquals(expected,result);
	}
}
