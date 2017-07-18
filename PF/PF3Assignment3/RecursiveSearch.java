package PF3;
public class RecursiveSearch {
	// takes array, number to search and index as argument and returns boolean
	public boolean linearSearch(int arr[], int num, int i){
		
		if(i >= arr.length)
			return false;
		if(arr[i] == num)
			return true;
	
		else 
			return linearSearch(arr, num,i+1);
	}
	/* takes array and it's leftmost and rightmost index and the
	 *  number to search as argument and returns boolean
	 */
	public boolean binarySearch(int arr[], int left, int right, int num){
		if(right >= left){
		int mid = left  + (right -left)/2;
		if(arr[mid] == num)
			return true;
		else if(arr[mid] > num)
			return binarySearch(arr,left,mid-1,num);
		else 
			return binarySearch(arr,mid+1,right,num);
		}
		return false;
	}
}
