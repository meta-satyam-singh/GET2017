import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestBinarySearch 
{

	private static BinarySearch searching;
	private int input;
	private int expected;
	
	@Parameters
	public static Collection<Object[]> data() 
	{
		return Arrays.asList(new Object[][] {{1, 0}, {4, 4}, {9, -1}, {6, 7}, {8, 12}});
	}
	
	public TestBinarySearch(int input, int expected) 
	{
		this.expected = expected;
		this.input = input;
	}
	
	@Before
	public void setUp() 
	{
		searching  = new BinarySearch(10, new int[] {1,1,2,3,4,5,5,6,6,6,6,7,8});
	}
	
	@Test
	public void testPerformBinarySearch() 
	{
		assertEquals(expected, searching.performBinarySearch(input, 0, 12));
	}

}