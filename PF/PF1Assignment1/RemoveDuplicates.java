public class RemoveDuplicates {
	public int[] removeDuplicates(int arr[] ){	
		{	
		int n = arr.length;
		int Diff_ele=0;
		for(int i = 0; i<n; i++){
			int k=arr[i];
			for(int j=0;j<n;j++){
				if(arr[i]==arr[j] && i!=j){
					arr[j]= -1;
				}
			}
		}
		for(int i = 0; i<n; i++){
			if(arr[i]!=-1)
				Diff_ele++;
		}
		int k=0;
		int result[] = new int[Diff_ele];
		for(int i=0; i<n; i++){
			if(arr[i]!=-1){
				result[k++]=arr[i];
			}
		}
        	return result;
    	}
}
