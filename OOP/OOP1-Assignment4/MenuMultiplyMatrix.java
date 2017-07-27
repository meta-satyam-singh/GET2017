package oop6;

public class MenuMultiplyMatrix extends Menu {
	String Name;
	public MenuMultiplyMatrix(String Name)
	{
		this.Name = Name ;
	}

	@Override
	public void actionTaken() 
	{
		
		Matrix matrix = new Matrix();
		int[][] firstMatrix ;
		int[][] secondMatrix ;
		do
		{
			firstMatrix = matrix.createMatrix();
			secondMatrix = matrix.createMatrix();
			if(firstMatrix.length != secondMatrix[0].length)
				System.out.println("Columns of 1 should be equal to rows of 2");
			else
				break;
		}while(true);
		int sum = 0;
		int[][] resultantMatrix = new int[firstMatrix.length][secondMatrix[0].length]; 
		for(int i = 0; i < firstMatrix.length ; ++i)
		{
			for(int j = 0; j < secondMatrix[0].length; ++j)
			{
				for(int k = 0 ; k < firstMatrix[0].length ; ++k)
					sum += firstMatrix[i][k] * secondMatrix[k][j];
				resultantMatrix[i][j] = sum;
				
				sum = 0;
			}
		}
		matrix.display(resultantMatrix);
	}

	@Override
	public void setName(String name)
	{
		this.Name = name ;
		
	}

	@Override
	public String getName() 
	{
		return Name;
	}

}
