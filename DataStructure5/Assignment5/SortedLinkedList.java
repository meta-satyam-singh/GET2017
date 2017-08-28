package Assignment5;
import java.util.LinkedList;

public class SortedLinkedList<E> 
{

	private LinkedList<E> linkedListSorted;	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public SortedLinkedList() 
	{
		linkedListSorted = new LinkedList();
	}
	
	public LinkedList<E> insert(E data) 
	{
		int i = 0;
		if(linkedListSorted.size() == 0) 
		{
			linkedListSorted.add(data);
		} 
		else 
		{
			insertInternal(data, i);
		}
		return linkedListSorted;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void insertInternal(E data, int i) 
	{
		E value;
		if(i >= linkedListSorted.size()) 
		{
			linkedListSorted.addLast(data);
			return ;
		}
		value = linkedListSorted.get(i);
		if(((Comparable)value).compareTo(data) > 0) 
		{
			if(i == 0) 
				linkedListSorted.addFirst(data);
			else
				linkedListSorted.add(i,data);
		} 
		else
			insertInternal(data,i+1);
	}
	

	public E get(int index) 
	{
		if(index < 0 || index >= linkedListSorted.size()) 
			throw new IllegalArgumentException("Wrong index value");
		return linkedListSorted.get(index);
	}

	public int size() 
	{
		return linkedListSorted.size();
	}
}
