/*
Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

Return the quotient after dividing dividend by divisor.

The integer division should truncate toward zero.

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Note:

Both dividend and divisor will be 32-bit signed integers.
The divisor will never be 0.
Assume we are dealing with an environment which could only store integers 
within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
 assume that your function returns 231 − 1 when the division result overflows.
 * */
public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(-2147483648,-2));
		System.out.println(divide(2147483647,2));
	}

	
	   public static int divide(int dividend, int divisor) {
	        
		   if(dividend == 0) {
			   return 0;
		   }
		   if(divisor == 0) {
			   return Integer.MAX_VALUE;
		   }
		   if(divisor == 1) {
			   return dividend;
		   } else if(divisor == -1 && dividend == Integer.MIN_VALUE) {
				   return Integer.MAX_VALUE;
		   }
		   
		    long dividendL = Math.abs((long)dividend);
		    long divisorL = Math.abs((long)divisor);
		    int result = 0;
		    
		    while(dividendL >= divisorL){
		        int shift = 0;    
		        while(dividendL >= (divisorL<<shift)){
		            shift++;
		        }
		 
		        result += 1<<(shift-1);
		        dividendL -= (divisorL<<(shift-1));
		    }
		 
		    if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)){
		        return result;
		    }else{
		        return -result;
		    }
	    }
}
