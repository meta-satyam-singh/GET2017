package oop3;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CreateReport 
{
	
	private String fileName;	//File name to write the answers
	private PrintWriter writer;
	
	public CreateReport(String file)
	{
		this.fileName = file;
	}

	private void createFile() throws FileNotFoundException 
	{
		writer = new PrintWriter(fileName);	//opening the file for writing
	}

	public void saveResult(ArrayList<String> answer) 
	{
		try
		{
			createFile();

			//loop to write each answer in the file
			for(int i=0; i<answer.size(); i++)
				writer.println(answer.get(i));
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			writer.close();
		}
	}
}

