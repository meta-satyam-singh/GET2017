package assignment_2;

import java.util.Arrays;

// a generic class for queue
public class Queue<E> 
{
	// an Object array
	private Object[] array;
	
	// variable to point front - the index from which elements will be removed
	// variable to point rear - the index to which elements will be added
	private int front , rear;

	public Queue(int capacity)
	{
		if( capacity < 0 )
			throw new IllegalArgumentException("Illegal Capacity: "+capacity);
		array = new Object[capacity];
		front = 0;		
		rear = 0;
	}
	
	public Queue()
	{
		array = new Object[10];
		front = 0;	
		rear = 0;
	}

	@SuppressWarnings("unchecked")
	public E enqueue(E item)
	{
		// to ensure the size of mergedList
		ensureCapacity(rear+1);
		array[rear++] = item;
		return (E)array[rear-1];
	}
	
	@SuppressWarnings("unchecked")
	public E dequeue()
	{
		if(front == rear)
			throw new IndexOutOfBoundsException("Queue Underflow");
		return (E)array[front++];
	}
	
	public boolean makeEmpty()
	{
		boolean flag = false;
		front = 0;
		rear = 0;
		if(front==0 && rear==0)
			flag = true;
		return flag;
	}
	
	@SuppressWarnings("unchecked")
	public E getFront()
	{
		return (E)array[front];
	}

	public void growCapacity(int minCapacity)
	{
		try
		{
			int oldCapacity = array.length;
			int newCapacity = oldCapacity + (oldCapacity >> 1);
			array = Arrays.copyOf(array, newCapacity);
		}
		catch(Exception ex)
		{
			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}

	public void ensureCapacity(int minCapacity){
		try
		{
			// if capacity is less then grow the capacity 
			if(minCapacity - array.length > 0)
				growCapacity(minCapacity);
		}
		catch(Exception ex)
		{
			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}

	public boolean isEmpty()
	{
		boolean flag = false;
		if(rear == front)
		{
			flag = true;
		}
		return flag;
	}
	public int getSize()
	{
		int size = rear - front ;
		return size;
	}
	
	public void print()
	{
		for(int i = front ; i < rear ; ++i )
			System.out.println(array[i]);
	}	
}