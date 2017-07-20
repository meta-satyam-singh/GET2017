package pf4;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
public class TestPermutation
{
	@Test
	public void testForABCD() 
	{
		String input = "ABCD";
		List<String> output = new Permutation().generatePermutations(input);
		List<String> expected = new ArrayList<String>(Arrays.asList("ABCD",
				"ABDC", "ACBD", "ACDB", "BACD", "BADC", "BCAD", "BCDA", "BDCA",
				"BDAC", "CBDA", "CBAD", "CDBA", "CDAB", "CADB", "CABD", "DCAB",
				"DCBA", "DACB", "DABC", "DBAC", "DBCA", "ADBC", "ADCB"));
		assertEquals(expected, output);
	}
	@Test
	public void testForABC() 
	{
		String input = "ABC";
		List<String> output = new Permutation().generatePermutations(input);
		List<String> expected = new ArrayList<String>(Arrays.asList("ABC","ACB", "BAC", "BCA", "CBA", "CAB"));
		assertEquals(expected, output);
	}
}