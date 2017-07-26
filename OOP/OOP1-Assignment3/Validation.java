package oop3;

public class Validation 
{
	public  int validateAnswerNumber(String answer) 
	{
		boolean result = true;
		
		//loop to check that the answer contains only numerals
		for(int i=0; i<answer.length(); i++) 
		{
			//condition if any character within answer is not a numeral
			if(!Character.isDigit(answer.charAt(i))) 
			{
				result = false;
			}
		}
		
		//if the answer is a numeric return the answer else null
		if(result) 
			return Integer.parseInt(answer);
		else 
			return -1;
	}
	
	// checks if product code is valid
	public boolean validateCode(String code , Product[] product)
	{	
		// checks for code in product array
		for(int i=0 ; i<product.length ;i++)
		{
			if(code.equals(product[i].getProductCode()))
				return true;
		} 
		return false;
	}
}
