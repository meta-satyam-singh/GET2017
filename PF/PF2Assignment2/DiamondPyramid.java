public class DiamondPyramid {
	public  String[] wholePyramid(int n){
		String[] invalid = {"invalid input"};
		if(n<= 0)
			return invalid;
		String[] result = new String[2*n-1];
		DiamondPyramid d=new DiamondPyramid();
		for(int i=0; i<n; i++){
			result[i] = d.returnSpaces(n,i)+d.returnNumbers(n,i)+d.returnSpaces(n,i);
			result[2*n-2-i] = result[i];
		}
		return result;
	}
	private  String returnSpaces(int n, int k){
		String spaces = new String();
		for(int i=0; i<n-k-1; i++){
			spaces +=" ";
		}
		return spaces;
	}
	private  String returnNumbers(int n, int k){
		String numbers = new String(Integer.toString(k+1));
		for(int i=k; i>0; i--){
			numbers = Integer.toString(i) + numbers + Integer.toString(i);
		}
		return numbers;
	}
}
