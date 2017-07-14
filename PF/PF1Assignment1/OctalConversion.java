
import java.lang.*;
public class OctalConversion {

	public static void main(String[] args) {
		int result = OctalConversion.convertBinaryToOctal(111101);

	}
	public static int convertBinaryToOctal(int binaryValue){
		int remainder = 0, octalValue = 0, j = 1, decimalValue = 0;
		while(binaryValue!=0){
			if(remainder!=0 && remainder!=1){
				return -1;
			}
			remainder = binaryValue % 10;
			decimalValue = decimalValue + (remainder*j);
			j = j*2;
			binaryValue = binaryValue/10;
		}
		remainder = 0;
		int i = 0;
		while(decimalValue!=0){
			remainder = decimalValue % 8;
			octalValue = (int) (octalValue + remainder*Math.pow(10, i));
			i++;
			decimalValue = decimalValue/8;
		}
		return octalValue;
	}

}

