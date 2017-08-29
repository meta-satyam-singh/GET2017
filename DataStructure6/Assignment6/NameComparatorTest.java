package Assignment6;

import static org.junit.Assert.*;

import org.junit.Test;

public class NameComparatorTest 
{

	@Test
	public void testCompare() 
	{
		Employee emp1 = new Employee("1","test1","aerwefrjio");
		Employee emp2 = new Employee("2","test2","aerwefrjio");
		assertEquals(-1,new NameComparator().compare(emp1, emp2));
		Employee emp3 = new Employee("3","test1","aerwefrjio");
		Employee emp4 = new Employee("4","test1","aerwefrjio");
		assertEquals(0,new NameComparator().compare(emp3, emp4));
		Employee emp5 = new Employee("5","test2","aerwefrjio");
		Employee emp6 = new Employee("6","test1","aerwefrjio");
		assertEquals(1,new NameComparator().compare(emp5, emp6));
	}

}
