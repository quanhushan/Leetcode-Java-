/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?

 */
public class PalindromeNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(10));
	}
	
public static boolean isPalindrome(int x) {
	if(x<0) {
		return false;
	}
	
	int input = x;
	int ans = 0;
	while(x != 0) {
		int temp = x % 10;
		x = x / 10;
		ans = ans * 10 + temp;
	}
	System.out.println(input);
	System.out.println(ans);
	if(ans == input) {
		return true;
    } else {
    	return false;
    }
}
}
