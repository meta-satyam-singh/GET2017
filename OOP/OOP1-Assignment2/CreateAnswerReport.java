package oop;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateAnswerReport 
{

	private String fileName;	//File name to write the answers
	private PrintWriter writer;
	
	public CreateAnswerReport(String file) 
	{
		this.fileName = file;
	}
	
	private void createFile() throws FileNotFoundException 
	{
		writer = new PrintWriter(fileName);		//opening the file for writing
	}
	
	public void saveResult(String[] answer) 
	{
		try 
		{
			createFile();
			
			//loop to write each answer in the file
			for(int i=0; i<answer.length; i++) 
				writer.println(answer[i]);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		writer.close();
	}
}