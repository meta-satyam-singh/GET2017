

import static org.junit.Assert.*;
import org.junit.Test;
public class OctalConversionTest {
	@Test
	public void invalidInput(){
		System.out.println("Test for Invalid Input");
		OctalConversion o = new OctalConversion();
		int Octal_Value = o.convertBinaryToOctal(101242);
		assertEquals("invalid input",-1,Octal_Value);
	}
	@Test
	public void checkZero(){
		System.out.println("Test for zero input");
		OctalConversion o = new OctalConversion();
		int Octal_Value = o.convertBinaryToOctal(000);
		assertEquals("input 0",0,Octal_Value);
	}	
	@Test
	public void validInput(){
		System.out.println("Test for valid Input");
		OctalConversion o = new OctalConversion();
		int Octal_Value = o.convertBinaryToOctal(110101);
		assertEquals("valid input",65,Octal_Value);
	}
}
