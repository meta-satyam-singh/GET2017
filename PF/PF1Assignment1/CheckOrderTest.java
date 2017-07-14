import static org.junit.Assert.*;

import org.junit.Test;

public class CheckOrderTest {


	@Test
	public void checkAscending(){
		System.out.println("Ascending order check");
		int input[]={1,2,3,4,5};
		int result = CheckOrder.orderCheck(input);
		assertEquals("ascending order", 1,result);
	}
	
	@Test
	public void checkDescending(){
		System.out.println("descending order check");
		int input[]={5,4,3,2,1};
		int result = CheckOrder.orderCheck(input);
		assertEquals("descending order", 2,result);
	}
	
	@Test
	public void checkNoOrder(){
		System.out.println("No order check");
		int input[]={1,2,4,3,5};
		int result = CheckOrder.orderCheck(input);
		assertEquals("no order", 0,result);
	}

}
