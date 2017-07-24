package oop;

public class SingleSelectReport 
{
	
	private String[] options;	//options for the particular question
	private String question;	//question for the type single select
	private int[] answerMarked;		//number of answers marked against each options
	
	// constructor to store question, type and options
	public SingleSelectReport(String question, String type, String options) 
	{
		this.question = question+","+type+","+options;		//Store the question
		this.options = options.split("/");		//Store all the options
		answerMarked = new int[this.options.length];	
		
		//initialize the number marked for options with 0
		for(int i=0; i<answerMarked.length; i++) 
			answerMarked[i] = 0;
	}
	
	// method to increment count of answer chosen by user
	public void storeAnswer(String answer) 
	{
		
		//loop to check which answer is chosen
		for(int i=0; i<options.length; i++) 
		{
			if(answer.equalsIgnoreCase(options[i])) 
				this.answerMarked[i]++;		//to increment the count for the option chosen
		}
	}
	
	// method to generate report for single choice type
	public StringBuffer generateReport(int participantNo) 
	{
		StringBuffer report = new StringBuffer(question+"\n");
		double percent;
		for(int i=0; i<options.length; i++) 
		{
			//Determining the percentage selected for each option
			percent = (answerMarked[i] * 100) / participantNo;
			//adding the option with its percentage to the final result
			report.append(options[i]+" - "+percent+"%\n");
		}
		return report;
	}
}