public class TrianglePyramid {
	public String[] wholePyramid(int n){
		String[] invalid = {"invalid input"};
		if(n<=0)
			return invalid;
		String[] result = new String[n];
		TrianglePyramid t = new TrianglePyramid();
		for(int i=0; i<n; i++){
			result[i] = t.returnSpaces(n,n-i-1)+t.returnNumbers(n,i);	
		}
		return result;
	}
	private String returnSpaces(int n, int k){
		String spaces = new String();
		for(int i=n-k-1; i>0; i--){
			spaces +=" ";
		}
		return spaces;
	}
	private String returnNumbers(int n, int k){
		String numbers = new String();
		for(int i=0; i<n-k; i++){
			numbers += Integer.toString(i+1) ;
		}
		return numbers;
	}
}
