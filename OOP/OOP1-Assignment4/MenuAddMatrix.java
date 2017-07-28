package oop6;

public class MenuAddMatrix extends Menu {
	
	String Name;
	public MenuAddMatrix(String Name)
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
			if((firstMatrix[0].length != secondMatrix[0].length) || (firstMatrix.length != secondMatrix.length))
				System.out.println("dimensions of 1 should be equal to dimensions of 2");
			else
				break;
		}while(true);
		int[][] resultantMatrix = new int[firstMatrix.length][firstMatrix[0].length]; 
		for(int i = 0; i < firstMatrix.length ; ++i)
		{
			for(int j = 0; j < secondMatrix[0].length; ++j)
				resultantMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
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

	

