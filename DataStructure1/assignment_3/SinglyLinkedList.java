
package assignment_3;

import java.util.NoSuchElementException;

// class to implement singly linked mergedList (Generic parameter E)
public class SinglyLinkedList<E> 
{
	// a start node
	Node<E> startNode;
	// initial size set to zero
	int size = 0;

	public E add(E item)
	{
		Node<E> newNode = new Node<E>(item);
		if(startNode == null)
		{
			startNode = newNode;
			newNode.nextNode = null;
			size++;
		}
		else
		{
			Node<E> tempNode = startNode;
			while(tempNode.nextNode != null)
			{
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = newNode;
			newNode.nextNode = null;
		}
		size++;
		return (E)newNode.nodeValue;
	}

	public E add(int location, E item)
	{
		// creating a new node to add and initializing its constructor with item
		Node<E> newNode = new Node<E>(item) ; 
		// a temporary position
		int tempPosition = 0;
		// if the mergedList is empty
		if(startNode == null)
		{
			startNode = newNode;
			newNode.nextNode = null;
		}

		// if the index is greater than size
		else if(location-1 > size)
		{
			throw new IllegalArgumentException("Location is greater than size : "+
					"location: "+location+","+"Size: "+size);
		}

		// to add node at a particular position
		else
		{
			Node<E> tempNode = startNode;
			while(tempPosition != location-1)
			{
				tempNode = tempNode.nextNode;
				tempPosition++;
			}
			newNode.nextNode = tempNode.nextNode;
			tempNode.nextNode = newNode;
		}

		size++;
		return (E)newNode.nodeValue;	
	}
	public boolean remove(E value)
	{
		boolean flag = false;
		// if mergedList is empty
		if(startNode == null)
		{
			throw new NoSuchElementException();
		}

		else
		{
			Node<E> tempPrevNode = startNode;
			Node<E> tempCurrentNode = startNode;
			while( ! (tempCurrentNode.nodeValue.equals(value)))
			{
				tempPrevNode = tempCurrentNode;
				tempCurrentNode = tempCurrentNode.nextNode;
			}
			if(tempCurrentNode == startNode)
			{
				startNode = tempCurrentNode.nextNode;
				tempCurrentNode = null;
				tempPrevNode = null;
				flag = true;
			}

			else
			{
				tempPrevNode.nextNode = tempCurrentNode.nextNode;
				tempCurrentNode = null;
				flag = true;
			}
		}
		size--;
		return flag;

	}

	public boolean remove(int index)
	{
		boolean flag = false;
		// temporary previous node
		Node<E> tempPrevNode = startNode;
		// temporary next node
		Node<E> tempNextNode = startNode;
		if(startNode == null)
			throw new NoSuchElementException();
		else if(index == 0)
		{
			startNode = tempNextNode.nextNode;
			tempNextNode = null;
			tempPrevNode = null;
			flag = true;
		}

		else
		{
			int position = 0;
			// traversing both previous and next node
			while(position != index)
			{
				tempPrevNode = tempNextNode;
				tempNextNode = tempNextNode.nextNode;
				position++;
			}

			// put the address of next node into previous one 
			tempPrevNode.nextNode = tempNextNode.nextNode;

			// set next node to null
			tempNextNode = null;
			flag = true;
		}
		size--;
		return flag;

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

	public E get(int index)
	{
		if(startNode == null)
		{
			throw new NoSuchElementException();
		}

		Node<E> tempNode = startNode;
		int position = 0;
		while(position != index)
		{
			tempNode = tempNode.nextNode;
			position++;
		}
		return tempNode.nodeValue;
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
}