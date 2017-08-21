package assignment_3;

// Node class to define a node in Linked List
public class Node<E> 
{
	
	// node value
	public E nodeValue;
	
	// next pointer in node
	public Node<E> nextNode;
	
	public Node()
	{
		nodeValue = null;
		nextNode = null;
	}
	public Node(E item)
	{
		nodeValue = item;
		nextNode = null;
	}
	 
	// returns value of the object
	@Override
	public String toString() 
	{
		return nodeValue.toString();
	}
}