
package assignment_1;

// a generic class for stack
public class Stack<E> 
{
	
	// an instance of singlyLinked List
	SinglyLinkedList<E> linkedList;
	
	// a top pointer to point at the recent element added into stack
	private int top = 0;
	
	public Stack()
	{	
		linkedList = new SinglyLinkedList<E>();
	}
	
	public E push(E element)
	{
		
		linkedList.add(element);
		top++;
		return linkedList.get(top-1);
		
	}
	
	public E pop()
	{
		if(top == 0)
		{
			throw new IndexOutOfBoundsException("Stack underflow");
		}
		
		E value = linkedList.get(top-1);
		linkedList.remove(top-1);
		top--;
		return value;
	}
	
	public E getTop()
	{
		if(top == 0)
		{
			throw new IndexOutOfBoundsException("stack is empty");
		}
		
		else
		{
			return linkedList.get(top-1);
		}
	}
	
	public E get(int index)
	{
		
		if(top == 0)
		{
			throw new IndexOutOfBoundsException("stack is empty");
		}
		
		else if(index >= top)
		{
			throw new IllegalArgumentException("size: "+top+" index: "+index);
		}
		return linkedList.get(index);
	}

	public void print()
	{
		linkedList.print();
	}
	
	public boolean isEmpty()
	{
		if(top == 0)
		{
			return true;
		}
		return false;
	}
	
	public int getSize()
	{
		return top;
	}
}