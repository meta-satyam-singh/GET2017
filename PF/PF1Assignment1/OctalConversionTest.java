

import static org.junit.Assert.*;

import org.junit.Test;

public class OctalConversionTest {

	@Test
	public void invalidInput(){
		System.out.println("Test for Invalid Input");
		int Octal_Value = OctalConversion.convertBinaryToOctal(101242);
		assertEquals("invalid input",-1,Octal_Value);
	}
	
	@Test
	public void checkZero(){
		System.out.println("Test for zero input");
		int Octal_Value = OctalConversion.convertBinaryToOctal(000);
		assertEquals("input 0",0,Octal_Value);
	}
	
	@Test
	public void validInput(){
		System.out.println("Test for valid Input");
		int Octal_Value = OctalConversion.convertBinaryToOctal(110101);
		assertEquals("valid input",65,Octal_Value);
	}
	

}
