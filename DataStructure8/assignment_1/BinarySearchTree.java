package assignment_1;

public class BinarySearchTree 
{
	
	public Node insertNode(Node startNode , int element)
	{
		if(startNode == null)
		{
			startNode = new Node();
			startNode.nodeValue = element;
			startNode.left = null;
			startNode.right = null;
		}
		
		else
		{
			if(startNode.nodeValue  >  element)
				startNode.left = insertNode(startNode.left, element);
			else if(startNode.nodeValue < element)
				startNode.right = insertNode(startNode.right, element);
		}
		return startNode;
	}
}