package PF3;

import static org.junit.Assert.*;
import org.junit.Test;

public class QuickSortTest {
	
	@Test
	public void noElement(){
		int[] input = {};
		QuickSort q = new QuickSort();
		int[] expected = q.sort(input,0,0);
		assertEquals("no  elements",expected,input);
	}
	
	@Test
	public void validInput(){
		int[] input = {2,5,8,9,10, 77, 55, 11};
		QuickSort q = new QuickSort();
		int[] result = q.sort(input, 0, input.length-1);
		int[] expected = {2,5,8,9,10,11,55,77};
		assertArrayEquals(expected,result);
	}
}
