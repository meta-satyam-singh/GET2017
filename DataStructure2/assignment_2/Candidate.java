package assignment_2;

public class Candidate 
{
	private String candidateName;
	private int candidateRank;

	public Candidate(String candidateName , int candidateRank)
	{
		this.candidateName = candidateName;
		this.candidateRank = candidateRank;
	}
	public void setCandidateName(String candidateName)
	{
		this.candidateName = candidateName;
	}
	public String getCandidateName()
	{
		return this.candidateName;
	}
	public void setCandidateRank(int candidateRank)
	{
		this.candidateRank = candidateRank;
	}
	public int getCandidateRank()
	{
		return this.candidateRank;
	}
}