
package assignment_4;

import java.util.NoSuchElementException;

// class to implement doubly linked mergedList
public class DoublyLinkedList<E> 
{

	// start node for linked mergedList
	Node<E> startNode;

	// set initial size to zero
	int size = 0;

	public E add(int index, E item)
	{
		Node<E> newNode = new Node<E>(item) ; 
		if(startNode == null)
		{
			startNode = newNode;
			//endNode = newNode;
			newNode.nextNode = null;
			newNode.prevNode = null;
		}
		else if(index > size)
		{
			throw new IllegalArgumentException("Location is greater than size : "+
					"location: "+index+","+"Size: "+size);
		}

		else if(index == 0  && startNode != null)
		{
			newNode.nextNode = startNode;
			startNode.prevNode = newNode;
			startNode = newNode;

		}

		else if(index == size )
		{
			Node<E> tempNode = startNode;
			while(tempNode.nextNode != null)
			{
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = newNode;
			newNode.prevNode = tempNode;
			newNode.nextNode = null;
		}
		else
		{
			index = index - 1;
			int tempPosition = 0;
			Node<E> tempNode = startNode;
			tempNode.nextNode = null;
			tempNode.prevNode = null;
			while(tempPosition != index)
			{
				tempNode = tempNode.nextNode;
				tempPosition++;
			}
			newNode.nextNode = tempNode.nextNode;
			tempNode.nextNode = newNode;
			newNode.prevNode = tempNode;
			newNode.nextNode.prevNode = newNode;
		}
		size++;
		return (E)newNode.nodeValue;	
	}
	
	public boolean remove(E value)
	{
		boolean flag = false;
		if(startNode == null)
			new IndexOutOfBoundsException("MergedList is empty");

		else
		{
			Node<E> tempPrevNode = startNode;
			Node<E> tempNextNode = startNode;
			while(tempNextNode != null && tempNextNode.nodeValue != value )
			{
				tempPrevNode = tempNextNode;
				tempNextNode = tempNextNode.nextNode;
			}

			if(tempNextNode == null)
			{
				throw new NoSuchElementException("value not present in mergedList");
			}

			else if(tempNextNode == startNode)
			{
				startNode = tempNextNode.nextNode;
				tempNextNode.nextNode.prevNode = startNode;
				tempNextNode = null;
				tempPrevNode = null;
				flag = true;
			}

			else if(tempNextNode.nextNode == null)
			{
				tempPrevNode.nextNode = null;
				tempNextNode = null;
				flag = true;
			}

			else
			{
				tempPrevNode.nextNode = tempNextNode.nextNode;
				tempNextNode.nextNode.prevNode = tempPrevNode;
				flag = true;
			}
		}

		size--;

		return flag;

	}
	public boolean remove(int index)
	{
		boolean flag = false;
		Node<E> tempPrevNode ;
		Node<E> tempNextNode ;
		if(startNode == null)
			throw new IndexOutOfBoundsException("MergedList is empty");

		else if(index > size - 1)
			throw new IndexOutOfBoundsException("index: "+index + " size: "+size);

		else if(index == 0)
		{
			tempPrevNode = startNode;
			tempNextNode = startNode;
			startNode = tempNextNode.nextNode;
			tempNextNode.nextNode.prevNode = startNode;
			tempNextNode = null;
			tempPrevNode = null;
			flag = true;
		}
		else
		{
			tempPrevNode = startNode;
			tempNextNode = startNode;
			int position = 0;
			while(tempNextNode != null && position != index)
			{
				tempPrevNode = tempNextNode;
				tempNextNode = tempNextNode.nextNode;
				position++;
			}

			if(index == size - 1)
			{
				tempPrevNode.nextNode = null;
				tempNextNode = null;
			}

			else
			{
				tempPrevNode.nextNode = tempNextNode.nextNode;
				tempNextNode.nextNode.prevNode = tempPrevNode;
			}
			flag = true;
		}
		size--;
		return flag;

	}
	
	public E get(int index)
	{
		if(startNode == null)
			throw new IllegalArgumentException("MergedList is empty");
		Node<E> tempNode = startNode;
		int position = 0;
		while(position != index)
		{
			tempNode = tempNode.nextNode;
			position++;
		}
		return tempNode.nodeValue;
	}
	
	public void reverse()
	{
		Node<E> prevNode = null;
		Node<E> currentNode = startNode;
		while(currentNode != null)
		{		
			Node<E> tempNode = currentNode;			
			currentNode = currentNode.nextNode;			
			tempNode.nextNode = prevNode;		
			prevNode = tempNode;
		}
		startNode = prevNode;
	}
	
	public void print()
	{
		Node<E> tempNode = startNode;
		while(tempNode != null)
		{
			System.out.println(tempNode);
			tempNode = tempNode.nextNode;
		}
	}

	public int size()
	{
		return size;
	}
}