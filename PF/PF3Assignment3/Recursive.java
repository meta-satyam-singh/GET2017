package PF3;
public class Recursive {
	public static void main(String[] args) {
		Recursive objForRec = new Recursive();
		System.out.println(objForRec.rem(5, 2));
		System.out.println(objForRec.gcd(1,2));
		System.out.println(objForRec.largestDigit(2));
	}
	// takes dividend and divisor and returns remainder
	public  int rem(int dividend, int divisor){
		if(dividend < 0 && divisor < 0)
			return -1;
		if(divisor == 0)
			return -1;
		if(dividend == 0)
			return 0;
		int subtractedValue = dividend-divisor;
		if(subtractedValue<divisor)
			return subtractedValue;
		return rem(subtractedValue,divisor);
	}
	//takes two numbers as argument and returns their gcd
	public  int gcd ( int x , int y )
	{
	    if ( y == 0 )                        
	        return x;
	    else if ( x >= y && y > 0)
	        return gcd ( y , x % y );
	    else return gcd ( y , x );        // if x < y then go ahead and switch them around.
	}
	// takes number as argument and returns largest digit
	public  int largestDigit(int num){
		if(num<10) return num;
		int k=num%10;
		num=num/10;
		int l=largestDigit(num);
		if(k>l)
			return k;
		else 
			return l;
	}
}
