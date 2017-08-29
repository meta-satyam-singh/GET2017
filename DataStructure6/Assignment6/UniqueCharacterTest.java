package Assignment6;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharacterTest 
{

	@Test
	public void testCountUniqueCharacter() 
	{
		int  expected = 3 ;
		int output = new UniqueCharacter().countUniqueCharacter("test");
		assertEquals(expected,output);
		int notExpected = 4;
		assertNotEquals(notExpected,new UniqueCharacter().countUniqueCharacter("test"));
	}

}
