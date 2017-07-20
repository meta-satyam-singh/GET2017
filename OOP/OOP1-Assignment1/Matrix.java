package OOP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Matrix 
{
	
	// Buffered Reader class for input
	BufferedReader br;
	public Matrix()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static void main(String[] args)
	{
		// object of class matrix
		Matrix matrix = new Matrix();
		// choice value is initialized
		int choice = 0; 
		// output matrix to store output
		int[][] outputMatrix;
		// input matrix to get input
		int[][] inputMatrix;
		while(true)
		{
			int flag= 0;
			// printing choices
			System.out.println("1. Add elements in matrix");
			System.out.println("2. Multiplication Of Matrix");
			System.out.println("3. Transpose of Matrix");
			System.out.println("4. exit");
			choice = matrix.getPositiveIntegerInput("Please enter your choice");
			switch(choice)
			{
				case 1:
					inputMatrix = matrix.addElements();
					matrix.show(inputMatrix);
					break;
				case 2:
					int[][] firstMatrix = matrix.addElements();
					int[][] secondMatrix = matrix.addElements();
					if(firstMatrix.length!=secondMatrix[0].length)
					{
						System.out.println("Matix dimension is not correct");
						break;
					}
					outputMatrix = matrix.multiplication(firstMatrix, secondMatrix);
					matrix.show(outputMatrix);
					break;
				case 3:
					inputMatrix = matrix.addElements(); 
					outputMatrix  = matrix.transpose(inputMatrix);
					matrix.show(outputMatrix);
					break;
				case 4:
					flag = 1;
					break;
			}
			if(flag == 1)
				break;
		}
	}
	
	// returns matrix after adding elements
	public int[][] addElements(){
		Matrix matrix = new Matrix();
		int numberOfRowsInMatrix = matrix.getPositiveIntegerInput("Please enter valid number of rows in matrix");
		int numberOfColumnsInMatrix = matrix.getPositiveIntegerInput("Please enter valid  number of columns in matrix");
		int[][] matrixArray = new int[numberOfRowsInMatrix][numberOfColumnsInMatrix];
		for(int i=0;i<numberOfRowsInMatrix;++i)
		{
			for(int j=0;j<numberOfColumnsInMatrix;++j)
			{
				matrixArray[i][j] = matrix.getAnyIntegerInput("Please enter valid value at " + (i+1) +" th row and "+(j+1) + " th column in matrix");
			}
		}
		return matrixArray;
	}
	public int getPositiveIntegerInput(String inputMessage){
		int inputNumber;
		try
		{
			System.out.println(inputMessage);
			inputNumber = Integer.parseInt(br.readLine());
			if(inputNumber <= 0)
			{
				inputNumber = getPositiveIntegerInput(inputMessage);
			}
		}
		catch(Exception ex)
		{
			System.out.println("invalid input: "+ex.getMessage());
			inputNumber = getPositiveIntegerInput(inputMessage);
		}
		return inputNumber;
	}
	public int getAnyIntegerInput(String inputMessage){
		int inputNumber;
		try
		{
			System.out.println(inputMessage);
			inputNumber = Integer.parseInt(br.readLine());
		}
		catch(Exception ex)
		{	
			System.out.println("invalid input: "+ ex.getMessage());
			inputNumber = getAnyIntegerInput(inputMessage);
		}
		return inputNumber;
	}
	
	// displays matrix
	public void show(int[][] matrix){
		for(int i=0; i < matrix.length ; ++i)
		{
			for(int j=0; j<matrix[0].length; ++j)
			{		
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// returns multiplied matrix by taking 2 matrix as input
	public int[][] multiplication(int[][] firstMatrix , int[][] secondMatrix)
	{
		int sum = 0;
		int[][] resultantMatrix = new int[firstMatrix[0].length][secondMatrix.length]; 
		for(int i=0; i<firstMatrix[0].length ;++i)
		{
			for(int j=0; j<secondMatrix.length;++j)
			{
				for(int k=0;k < firstMatrix.length ; ++k)
				{
					sum += firstMatrix[i][k] * secondMatrix[k][j];
				}
				resultantMatrix[i][j] = sum;
				sum = 0;
			}
		}
		return resultantMatrix;
	}
	
	// returns transpose of input matrix
	public int[][] transpose(int[][] matrix)
	{
		int[][] matrixTranspose = new int[matrix[0].length][matrix.length];
		for(int i=0; i<matrix[0].length; ++i)
		{
			for(int j=0;j<matrix.length;++j)
				matrixTranspose[i][j] = matrix[j][i];
		}
		return matrixTranspose;
	}
}