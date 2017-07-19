package pf4;

public class NQueenProblem
{
    // function to print solution 
    public static void main(String args[])
    {
    	NQueenProblem nq = new NQueenProblem();
    	int[][] board = {{0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0},
    			{0, 0, 0, 0},{0, 0, 0, 0} };
    	int dim = 4;
    	boolean result = nq.nQueen(board,0,dim);
    	System.out.println(result);
        for (int i = 0; i < dim; i++)
        {
            for (int j = 0; j < dim; j++)
                System.out.print(" " + board[i][j]
                                 + " ");
            System.out.println();
        }
    }
    // Function to check if position is safe 
    boolean isSafe(int board[][], int row, int col, int dim)
    {
        int i, j;
        // Check this col upwards
        for (i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;
        // Check upper diagonal on left side 
        for (i=row, j=col; i>=0 && j>=0; i--, j--)
            if (board[i][j] == 1)
                return false;
        // Check upper diagonal on right side 
        for (i=row, j=col; j<dim && i>=0; i--, j++)
            if (board[i][j] == 1)
                return false;
        return true;
    }
    // A recursive function to solve NQueen problem 
    boolean nQueen(int board[][], int row, int dim){
        //If all queens are placed then return true 
        if (row >= dim)
            return true;
        /* Consider this row and try placing
           this queen in all columns one by one */
        for (int i = 0; i < dim; i++)
        {
            // Check if queen can be placed on board[row][i] 
            if (isSafe(board, row, i, dim))
            {
                /* Place this queen in board[row][i] */
                board[row][i] = 1;
                /* recur to place rest of the queens */
                if (nQueen(board, row + 1, dim) == true)
                    return true;
                /* If placing queen in board[row][i]
                   doesn't lead to a solution then
                   remove queen from board[row][i] */
                board[row][i] = 0;
            }
        }
        /* If queen can not be placed in any column in
           this row, then return false */
        return false;
    }
}