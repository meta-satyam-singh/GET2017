package oop;

public class Question implements Comparable<Question>
{

	String question;	//String to store the question
	String type;	//String to store the question type
	String choices;		//String to store the choices of question
	
	public Question() 
	{
		question = null;
		type = null;
		choices = null;
	}
	
	public void setQuestion(String ques) 
	{
		this.question = ques;
	}

	public void setType(String type) 
	{
		this.type = type;
	}
	
	public void setChoices(String choice) 
	{
		this.choices = choice;
	}

	public String getQuestion() 
	{
		return question;
	}

	public String getType() 
	{
		return type;
	}

	public String getChoices() 
	{
		return choices;
	}

	@Override
	public int compareTo(Question o) 
	{
		String arg1 = "";
		String arg2 = "";
		String[] temp;
		
		//Getting the text of question excluding the question number
		temp = question.split(". ");
		arg1=temp[1];
		
		//Getting the text of question excluding the question number
		temp = o.getQuestion().split(". ");
		arg2=temp[1];
		
		return arg1.compareTo(arg2);
	}
}