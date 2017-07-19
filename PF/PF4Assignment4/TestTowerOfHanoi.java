package pf4;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
public class TestTowerOfHanoi 
{

	ArrayList<String> expectedListForValue3 = new ArrayList<String>(Arrays.asList(
			"Move Disk 3 from A to B", "Move Disk 2 from A to C", "Move Disk 3 from B to C",  
			"Move Disk 1 from A to B", "Move Disk 3 from C to A", "Move Disk 2 from C to B", 
			"Move Disk 3 from A to B"));
	
	ArrayList<String> expectedListForValue2 = new ArrayList<String>(Arrays.asList(
			"Move Disk 2 from A to C", "Move Disk 1 from A to B", "Move Disk 2 from C to B"));
	
	ArrayList<String> expectedListForValue1 = new ArrayList<String>(Arrays.asList("Move Disk 1 from A to B"));
		
	ArrayList<String> input1 = new ArrayList<String>();
	ArrayList<String> input2 = new ArrayList<String>();
	ArrayList<String> input3 = new ArrayList<String>();

	@Test
	public void testTowerForValue3()
	{
			
		List<String> result1 = new ArrayList<String>();
		TowerOfHanoi t = new TowerOfHanoi();
		result1 = t.towerOfHanoi("A", "B", "C", 3);
		assertEquals(expectedListForValue3, result1 );
	}
	@Test
	public void testTowerForValue2() 
	{
		TowerOfHanoi t = new TowerOfHanoi();
		result2 = t..towerOfHanoi("A", "B", "C", 2);
		assertEquals(expectedListForValue2, result2 );
	}
	@Test
	public void testTowerForValue1() 
	{
			
		TowerOfHanoi t = new TowerOfHanoi();
		result3 = t..towerOfHanoi("A", "B", "C", 1);
		assertEquals(expectedListForValue1, result3 );
	}
}
