
package assignment_2;

import assignment_1.ArrayList;

// class MergedList to merge two lists 
public class MergedList 
{	
	public static void main(String[] args)
	{
		// object of mergedList 
		MergedList mergedList = new MergedList();
		// creating arraylist1 by using the previous class made in assignment one
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		// adding random elements in arraylist1
		for(int i = 0; i <= 20 ;++i)
			arrayList1.add(i);
		// creating arraylist2 
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		
		// adding random elements in arraylist2 
		for(int i = 21 ;i <= 40 ;++i)
			arrayList2.add(i);
		
		// merging two lists 
		arrayList1 = mergedList.mergeList(arrayList1 , arrayList2);
		
		// printing merged mergedList
		System.out.println("Merged MergedList: ");
		for(int i = 0 ;i < arrayList1.size() ;++i)
			System.out.println(arrayList1.getIndex(i));
	}
	
	public ArrayList<Integer> mergeList(ArrayList<Integer> arrayList1 , ArrayList<Integer> arrayList2)
	{
		for(int i = 0; i < arrayList2.size() ;++i)
			arrayList1.add(arrayList2.getElement(i));
		return arrayList1;
	}

}
