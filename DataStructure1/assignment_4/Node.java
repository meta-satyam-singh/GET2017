package assignment_4;
// class of node (an entity of doubly linked mergedList)(Generic type)
public class Node<E> 
{
	// generic variable to set node value
	public E nodeValue;
	// pointer for next node
	public Node<E> nextNode;
	// pointer for previous node
	public Node<E> prevNode;
	public Node()
	{
		nodeValue = null;
		nextNode = null;
		prevNode = null;
	}
	public Node(E item)
	{
		nodeValue = item;
		nextNode = null;
		prevNode = null;
	}
	@Override
	public String toString() 
	{
		return nodeValue.toString();
	}

}