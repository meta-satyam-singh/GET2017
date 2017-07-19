package pf4;
import static org.junit.Assert.*;
import org.junit.Test;
public class NQueenProblemTest 
{
	NQueenProblem nq = new NQueenProblem();
	@Test
	public void testNQueenFor3d() 
	{
		int[][] board = {{0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0},
	            			{0, 0, 0, 0},{0, 0, 0, 0} };
		boolean result = nq.nQueen(board, 0, 4);
		boolean expected = true;
		assertEquals(expected, result);
	}
	@Test
	public void testNQueenFor2d() 
	{
		int[][] board = {{0, 0},{0, 0} };
		boolean result = nq.nQueen(board, 0, 2);
		boolean expected = false;
		assertEquals(expected, result);
	}
}
