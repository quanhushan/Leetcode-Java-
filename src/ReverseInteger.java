/*
 * Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1]. F
or the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 * 
 * 
 * 
 * */


public class ReverseInteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1534236463));
	}
	
public static int reverse(int x) {
	
	int ans = 0;
	int check;
	while(x != 0) {
		int temp = x % 10;
		x = x / 10;
		check = ans;
		ans = ans * 10 + temp;
		if(ans /10 != check) {
			return 0;
		}
	}
	
	return ans;
    }
}
