package assignment_1;

public class Node 
{
	// variable to define node value
	public int nodeValue;
	
	// variable to define right and left pointer of tree
	public Node left , right;

	public Node()
	{
		nodeValue = 0;
		left = null;
		right = null;
	}
	
	public Node(int element)
	{
		nodeValue = element;
		left = null;
		right = null;
	}
	
	public String toString()
	{
		return String.valueOf(nodeValue);
	}
}
