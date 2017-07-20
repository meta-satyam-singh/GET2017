package OOP1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTest {

	Matrix matrix = new Matrix();
	@Test
	public void test() {

		int array2D1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int array2D2[][] = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		int array2D3[][] = { { 14, 32, 50 }, { 32, 77, 122 }, { 50, 122, 194 } };
		
		// check for transpose matrix
		assertArrayEquals(array2D2, matrix.transpose(array2D1)); 
		
		// check for multiplication of matrix
		assertArrayEquals(array2D3,matrix.multiplication(array2D1, array2D2));
																		
	}

}
