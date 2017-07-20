
public class TrianglePyramid {

	public static void main(String[] args) {
		String[] result =TrianglePyramid.wholePyramid(5);
		for(int i=0;i<5;i++){
			System.out.println(result[i]);
		}

	}
	public static String[] wholePyramid(int n){
		String[] invalid = {"invalid input"};
		if(n<=0)
			return invalid;
		String[] result = new String[n];
		for(int i=0;i<n;i++){
			result[i] = returnSpaces(n,n-i-1)+returnNumbers(n,i);
			
		}
		return result;
	}
	public static String returnSpaces(int n, int k){
		String spaces = new String();
		for(int i=n-k-1;i>0;i--){
			spaces = spaces + " ";
		}
		return spaces;
	}
	public static String returnNumbers(int n, int k){
		String numbers = new String();
		//numbers = Integer.toString(n-k);
		for(int i=0;i<n-k;i++){
			numbers =  numbers+Integer.toString(i+1) ;
		}
		//System.out.print(numbers);
		return numbers;
	}

}
