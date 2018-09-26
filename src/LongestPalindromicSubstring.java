/*
 Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
Example 1:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:
Input: "cbbd"
Output: "bb"
 
*/
public class LongestPalindromicSubstring {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("cc"));
	}
	
public static String longestPalindrome(String s) {
	if(s.equals("")) {
		return "";
	}
	int length = s.length();
	int i = 0;
	int j = 0;
	int max;
	int realMax;
	String temp;
	String maxString="";
	String realMaxString="";
	while(i < length) {
		j = i + 2;
		while(j <= length) {
			int count = 0;
			temp= s.substring(i, j);
			int head = 0;
			int tail = j - i;
			max = maxString.length();
			realMax = realMaxString.length();
			if(max >= realMax) {
			realMaxString = maxString;
			}
			if(realMaxString.length() < tail) {
				while(temp.charAt(head) == temp.charAt(tail-1)) {
					head++;
					tail--;
					count++;
					if(count >= (j/2)-1 ) {
						maxString = temp;
					}
					if(head == tail -1 || head == tail) {
						maxString = temp;
					}
					if((head > tail-1)) {
						break;
					}
				}
			}
				
		j++;
		}
		i++;
	}
	if(maxString.length() <= 1) {
		return String.valueOf(s.charAt(0));
	}else if(maxString.length()>realMaxString.length()) {
		return maxString;
	}else {
		return realMaxString;	
	}
    }

}
