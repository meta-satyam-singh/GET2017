import static org.junit.Assert.*;
import org.junit.Test;
public class TrianglePyramidTest 
{
	@Test
	public void test() 
	{
		String[] result = {"12345"," 1234","  123","   12","    1"};
		TrianglePyramid t = new TrianglePyramid();
		String[] expected = t.wholePyramid(5);
		assertArrayEquals(expected,result);
	}
	@Test
	public void test() 
	{
		String[] result = {"123456"," 12345","  1234","   123","    12","     1"};
		TrianglePyramid t = new TrianglePyramid();
		String[] expected = t.wholePyramid(6);
		assertArrayEquals(expected,result);
	}
	@Test
	public void testInvalidInput() 
	{
		String[] result = {"invalid input"};
		TrianglePyramid t = new TrianglePyramid();
		String[] expected = t.wholePyramid(0);
		assertArrayEquals(expected,result);
	}
}
