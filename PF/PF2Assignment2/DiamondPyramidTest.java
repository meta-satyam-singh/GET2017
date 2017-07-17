import static org.junit.Assert.*;
import org.junit.Test;
public class DiamondPyramidTest {
	@Test
	public void testWholePyramid() {
		String[] result = {"    1    ","   121   ","  12321  "," 1234321 ","123454321"," 1234321 ","  12321  "
				           ,"   121   ","    1    "};
		DiamondPyramid d=new DiamondPyramid();
		String[] expected=d.wholePyramid(5);
		assertArrayEquals(expected,result);
	}
	public void testWholePyramidForEven() {
		String[] result = {"     1     ","    121    ","   12321   ","  1234321  "," 123454321 ","12345654321"," 123454321 ","  1234321  ","   12321   "
				           ,"    121    ","     1     "};
		DiamondPyramid d=new DiamondPyramid();
		String[] expected=d.wholePyramid(6);
		assertArrayEquals(expected,result);
	}
	@Test
	public void testInvalidInput() {
		String[] result = {"invalid input"};
		DiamondPyramid d=new DiamondPyramid();
		String[] expected=d.wholePyramid(-2);
		assertArrayEquals(expected,result);
	}
}
