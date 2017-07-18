package PF3;

public class Recursive {

	public static void main(String[] args) {
		Recursive k=new Recursive();
		System.out.println(k.rem(5, 2));
		System.out.println(k.gcd(1,2));
		System.out.println(k.largestDigit(2));
	}
	
	// takes dividend and divisor and returns remainder
	public static int rem(int dividend, int divisor){
		if(divisor == 0)
			return -1;
		if(dividend == 0)
			return 0;
		int k= dividend-divisor;
		if(k<divisor)
			return k;
		return rem(k,divisor);
	}
	
	//takes two numbers as argument and returns their gcd
	public static int gcd ( int x , int y )
	{
	    if ( y == 0 )                        
	        return x;
	    else if ( x >= y && y > 0)
	        return gcd ( y , x % y );
	    else return gcd ( y , x );        // if x < y then go ahead and switch them around.
	}
	
	// takes number as argument and returns largest digit
	public static int largestDigit(int num){
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
