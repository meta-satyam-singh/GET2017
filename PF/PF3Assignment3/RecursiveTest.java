package PF3;
import static org.junit.Assert.*;
import org.junit.Test;
public class RecursiveTest {	
	// test for perfect divisible
	@Test
	public void testForPerfectDivisible() {
		int input1 = 2;
		int input2 = 1;
		int expected = 0;
		int result = new Recursive().rem(input1,input2);
		assertEquals(expected,result);
	}	
	// test for divisor equals to 0
	@Test
	public void testRemForIllegalDivisor() {
		int input1 = 2;
		int input2 = 0;
		int expected = -1;
		int result = new Recursive().rem(input1,input2);
		assertEquals(expected,result);
	}
	// test for not perfectly divisible
	@Test
	public void testForNotPerfectlyDivisible() {
		int input1 = 100;
		int input2 = 3;
		int expected = 1;
		int result = new Recursive().rem(input1,input2);
		assertEquals(expected,result);
	}
	@Test
	public void testGcd1() {
		int input1 = 2;
		int input2 = 1;
		int expected = 1;
		int result = new Recursive().gcd(input1,input2);
		assertEquals(expected,result);
	}
	@Test
	public void testGcd2() {
		int input1 = 12;
		int input2 = 18;
		int expected = 6;
		int result = new Recursive().gcd(input1,input2);
		assertEquals(expected,result);
	}
	@Test
	public void testGcd3() {
		int input1 = 100;
		int input2 = 3;
		int expected = 1;
		int result = new Recursive().gcd(input1,input2);
		assertEquals(expected,result);
	}
	// test for single digit
	@Test
	public void testlargestDigit1() {
		int input = 2;
		int expected = 2;
		int result = new Recursive().largestDigit(input);
		assertEquals(expected,result);
	}
	// test for larger digit
	@Test
	public void testLargestDigit2() {
		int input = 1257369;
		int expected = 9;
		int result = new Recursive().largestDigit(input);
		assertEquals(expected,result);
	}
	// test for same digits
	@Test
	public void testlargestDigit3() {
		int input = 444;
		int expected = 4;
		int result = new Recursive().largestDigit(input);
		assertEquals(expected,result);
	}
}
