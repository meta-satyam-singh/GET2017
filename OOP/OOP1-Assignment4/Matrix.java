package oop6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Matrix {
	private Scanner scan;
	private CompositeMenuItem mainMenu;		
	private Menu[] menuItems;
	BufferedReader br;

	public Matrix()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		menuItems = new Menu[4];
	}
	public void createMenu() 
	{
		//Creating the Menu items
		menuItems[0] = new MenuAddMatrix("add");
		menuItems[1] = new MenuMultiplyMatrix("multi");
		menuItems[2] = new MenuTransposeMatrix("tran");
		menuItems[3] = new Exit("exit");
		
		//Adding the menu items
		mainMenu = new CompositeMenuItem("Main Menu", menuItems);
		//Display the main menu
		mainMenu.actionTaken();
		scan.close();
	}
	
	public void display(int[][] result)
	{
		for(int i=0;i < result.length ; ++i)
		{
			for(int j=0;j<result[0].length;++j)
				System.out.print(result[i][j]+" ");
			System.out.println();
		}
		
	}
	public int getPositiveIntegerInput(String inputMessage, boolean negative_allowed )
	{
		int inputNumber;
		try
		{
			System.out.println(inputMessage);
			inputNumber = Integer.parseInt(br.readLine());
			if(inputNumber <= 0)
				inputNumber = getPositiveIntegerInput(inputMessage, negative_allowed);

		}
		catch(Exception ex)
		{
			System.out.println("invalid input: " + ex.getMessage());
			inputNumber = getPositiveIntegerInput(inputMessage, negative_allowed);
		}
		return inputNumber;
	}
	
	public int[][] createMatrix()
	{
		Matrix matrix = new Matrix();
		int numberOfRowsInMatrix = matrix.getPositiveIntegerInput("Please enter valid number " + "of rows in matrix", false);
		int numberOfColumnsInMatrix = matrix.getPositiveIntegerInput("Please enter valid " + "number of columns in matrix", false);
		int[][] matrixArray = new int[numberOfRowsInMatrix][numberOfColumnsInMatrix];
		for(int i = 0; i < numberOfRowsInMatrix; ++i)
		{
			for(int j = 0; j < numberOfColumnsInMatrix; ++j)
				matrixArray[i][j] = matrix.getPositiveIntegerInput("Please enter valid value at " + (i + 1) +" th row and "+ (j + 1) + " th column in matrix", true);
		}
		return matrixArray;
	}
	public static void main(String args[])
	{
		Matrix matrix = new Matrix();
		matrix.createMenu();

	}
}
