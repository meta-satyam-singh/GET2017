package Assignment5;

import java.util.LinkedList;
import java.util.List;

public class QueueImplementation<E>
{
	private List<E> queue;	
	private int front;	
	private int rear;	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public QueueImplementation() 
	{
		queue = new LinkedList();
		front = 0;
		rear = 0;
	}

	public int rear() 
	{
		return rear;
	}

	public int front() 
	{
		return front;
	}

	public E getFront() 
	{
		//Check if the queue is empty
		if(rear <= front) 
			throw new IllegalAccessError("Queue underflow condition");
		return queue.get(front);
	}

	public void makeEmpty() 
	{
		queue.clear();
		front = 0;
		rear = 0;
	}
	
	public void enqueue(E element) 
	{
		queue.add(element);
		rear++;
	}
	
	public E dequeue() 
	{
		//Check if the queue is empty
		if(rear <= front) 
			throw new IllegalAccessError("Queue underflow condition");
		return queue.get(front++);
	}
	
	public int size() 
	{
		return rear-front;
	}
}
