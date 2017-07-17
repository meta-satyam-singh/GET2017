public class CheckOrder {
	public  int orderCheck(int arr[]){
		int flag = 0;
		for(int i=0; i<arr.length-1; i++){
			if(arr[i] <= arr[i+1]){
				flag = 1;
			}
			else{
				flag = 0;
				break;
			}
		}
		if(flag==0){
			for(int i=0; i< arr.length-1; i++){
				if(arr[i] >= arr[i+1]){
					flag = 2;
				}
				else{
					flag = 0;
					break;
				}
			}
		}
		if(arr[0] == arr[arr.length-1]){
			flag = 0;
		}
		return flag ;
	}
}
