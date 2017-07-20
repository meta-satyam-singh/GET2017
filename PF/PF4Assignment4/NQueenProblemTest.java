package pf4;
import static org.junit.Assert.*;
import org.junit.Test;
public class NQueenProblemTest 
{
	NQueenProblem nqueen = new NQueenProblem();
	@Test
	public void testNQueenFor4x4() 
	{
		int[][] board = {{0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0},
	            			{0, 0, 0, 0},{0, 0, 0, 0} };
		boolean result = nqueen.nQueen(board, 0, 4);
		boolean expected = true;
		assertEquals(expected, result);
	}
	@Test
	public void testNQueenFor2x2() 
	{
		int[][] board = {{0, 0},{0, 0} };
		boolean result = nqueen.nQueen(board, 0, 2);
		boolean expected = false;
		assertEquals(expected, result);
	}
}
