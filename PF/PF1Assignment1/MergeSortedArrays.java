/*
 * Satyam Singh
 * Program to merge two sorted arrays
*/
class MergeSortedArrays
{
 public static int[] mergeArrays(int a[], int asize, int b[], int bsize, int c[]){
		int j = 0, k = 0, i = 0;
		int n1 = asize,n2 = bsize;
		while( j < asize && k < bsize)
		{
			if( a[j] < b[k] ){
				c[i++] = a[j++];
			}
			else{
				c[i++] = b[k++];
			}
		}
		while( j < asiz )
		{
			c[i++] = a[j++];
		}
		while( k < bsize )
		{
			c[i++]	= b[k++];
		}
	 	RemoveDuplicates r = new RemoveDuplicates();
		int result[] = .removeDuplicates(c);
		return result;
	}
}
