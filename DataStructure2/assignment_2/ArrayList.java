package assignment_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

// generic ArrayList class to support all operations related to mergedList(generic parameter <E>)s 
public class ArrayList<E> 
{

	// a variable to define the size of mergedList
	private int size;

	// an object variable for array
	private Object[] array;

	public ArrayList(int initialCapacity)
	{
		if(initialCapacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: "+initialCapacity);
		this.array = new Object[initialCapacity];
	}

	public ArrayList()
	{
		this.array = new Object[10];
	}

	public void add(E e)
	{
		// to ensure the size of mergedList
		ensureCapacity(size+1);
		array[size++] = e;

	}

	public void add(int index , E e)
	{
		// check for range if it is greater than -1 and less than size
		checkForRange(index);
		for(int i = index;i < size;++i)
		{
			// to ensure the size of mergedList
			ensureCapacity(size+1);
			array[i+1] = array[i];
		}
		array[index] = e;
		// increment size
		size++;
	}

	public void remove(int location)
	{
		// check range of index
		checkForRange(location);
		for(int i = location+1 ; i < size ;++i)
		{
			array[i-1] = array[i];
		}
		size--;
	}

	public void remove(E e)
	{
		int tempIndex = 0;
		
		// check if element is present in array and store its index
		for(int i=0;i < size;++i)
		{
			if(array[i] == e)
			{
				tempIndex = i;
				break;
			}
		}

		// remove and shift all elements of array
		for(int i = tempIndex+1 ; i < size ;++i)
		{
			array[i-1] = array[i];
			size--;
		}

	}
	
	public int getIndex(E e)
	{
		int tempIndex = 0 , flag = 2;
		
		// check if element is present in array and store its index
		for(int i=0;i < size; ++i)
		{
			if(array[i] == e)
			{
				tempIndex = i;
				flag = 1;
				break;
			}
		}

		if(flag == 2)
		{
			throw new NoSuchElementException();
		}
		
		// return index
		return tempIndex;
	}
	
	@SuppressWarnings("unchecked")
	public E getElement(int location)
	{
		// check if index is in range else throw IndexOutOfBounds exception
		if(location > size-1 || location < 0)
			throw new IndexOutOfBoundsException("location: "+location+","+"size: "+size);
		return (E)array[location];
	}
	

	public boolean overwriteElement(int location,E newValue)
	{
		if(location > size - 1 || location < 0)
			throw new IndexOutOfBoundsException("location: "+location+","+"size: "+size);
		array[location] = newValue;
		return true;
	}
	
	public void ensureCapacity(int minCapacity)
	{
		try
		{
			// if capacity is less then grow the capacity 
			if(minCapacity - array.length > 0)
			{
				growCapacity(minCapacity);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Something went wrong: "+ex.getMessage());
		}

	}

	public int getSize()
	{
		return size;
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
	
	public void checkForRange(int index)
	{
		if(index > size && index < 0)
			throw new ArrayIndexOutOfBoundsException("index: "+index+"size: "+size);
	}
	
	public void reverseList()
	{
		int index = 0;
		Object[] reverseArray = new Object[size];
		// reversing the array
		for(int i = size-1 ; i >=0 ;--i )
		{
			reverseArray[index++] = array[i];
		}
		// transferring the reversed array into original one
		array = reverseArray;
	}

	public void sort()
	{
		// temporary array to store the original values
		Object[] tempArray = new Object[size];
		// comparator object to compare the elements 
		Comparator<E> c = new Comparator<E>() 
		{
			// override compare method to compare two objects
			@Override
			public int compare(E arg0, E arg1) 
			{
				int compareValue = arg0.toString().compareTo(arg1.toString());
				return compareValue;
			}

		};
		// called merge sort to sort the array
		mergeSort(0 , size - 1, tempArray, c);
	}

	public void mergeSort(int low , int high , Object[] sortedArray , Comparator<E> c)
	{
		if(low < high)
		{
			int mid = low + (high - low) / 2;
			mergeSort(low , mid , sortedArray , c);
			mergeSort(mid+1 , high , sortedArray , c);
			merge(low , mid , high , sortedArray , c);
		}

	}

	@SuppressWarnings("unchecked")
	public void merge(int low , int mid , int high , Object[] sortedArray , Comparator<E> c)
	{
		for (int i = low; i <= high; i++)
			sortedArray[i] = array[i];
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high)
		{
			if (c.compare((E)sortedArray[j], (E)sortedArray[i]) > 0 ) 
			{
				array[k] = sortedArray[i];
				i++;
			} 
			else 
			{
				array[k] = sortedArray[j];
				j++;
			}
			k++;
		}
		while (i <= mid)
		{
			array[k] = sortedArray[i];
			k++;
			i++;
		}

	}
	 
	public boolean clearList()
	{
		size = 0;
		return true;
	}
}