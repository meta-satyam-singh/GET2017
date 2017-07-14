public class RemoveDuplicates {

	public static void main(String[] args) {
		int input[] = {1,2,3,3,5,6,7,8};
		int result[] = removeDuplicates(input);
		for(int i =0;i<result.length;i++){
			System.out.print(result[i]);
		}
	}
	public static int[] removeDuplicates(int arr[] ){	
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

