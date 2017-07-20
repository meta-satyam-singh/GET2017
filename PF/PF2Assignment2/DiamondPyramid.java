public class DiamondPyramid {
	public static void main(String args[]){
		String[] result =DiamondPyramid.wholePyramid(1);
		for(int i=0;i<2*1-1;i++){
			System.out.println(result[i]);
		}
	}
	public static String[] wholePyramid(int n){
		String[] invalid = {"invalid input"};
		if(n<=0)
			return invalid;
		String[] result = new String[2*n-1];
		for(int i=0;i<n;i++){
			result[i] = returnSpaces(n,i)+returnNumbers(n,i)+returnSpaces(n,i);
			result[2*n-2-i] = returnSpaces(n,i)+returnNumbers(n,i)+returnSpaces(n,i);
		}
		return result;
	}
	public static String returnSpaces(int n, int k){
		String spaces = new String();
		for(int i=0;i<n-k-1;i++){
			spaces = spaces + " ";
		}
		return spaces;
	}
	public static String returnNumbers(int n, int k){
		String numbers = new String();
		numbers = Integer.toString(k+1);
		for(int i=k;i>0;i--){
			numbers = Integer.toString(i) + numbers + Integer.toString(i);
		}
		//System.out.print(numbers);
		return numbers;
	}
}
