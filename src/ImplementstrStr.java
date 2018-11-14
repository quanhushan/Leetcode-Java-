/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. 
This is consistent to C's strstr() and Java's indexOf().
 * */


public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("aaaa","bba"));
		System.out.println(strStr("mississippi","issip"));
		System.out.println(strStr("mississippi","pi"));
	}
	
	 public static int strStr(String haystack, String needle) {
		 
		 if(needle.equals("")){
			 return 0;
	        }
		 
		 int a = haystack.length();
		 int b = needle.length();
		 
		 if(a < b) {
			 return -1;
		 }
		 
		char[] x = haystack.toCharArray();
		 
		 for(int i = 0; i < a - b + 1; i++){
			
			 String temp = new String(x,i,b);
			 if(temp.equals(needle)) {
				 return i;
			 }
		 }
		 
		 return -1;
	    }

}

/* low performance
 public static int strStr(String haystack, String needle) {
		 
		 if(needle.equals("")){
			 return 0;
	        }
		 
		 int a = haystack.length();
		 int b = needle.length();
		 
		 if(a < b) {
			 return -1;
		 }
		 
		 int count = 0;
		 int ans = -1;
		 int keep = Integer.MAX_VALUE;
		 
		 for(int i = 0; i < a; i++){
			 if(haystack.charAt(i) == needle.charAt(count)) {
				 if(i < keep) {
					 keep = i;
				 }
				 count++;
				 if(count == b) {
					 return  i - b + 1;
				 }
			 } else {
				 if(count != 0) {
					 i = keep;
				 }
				 keep = Integer.MAX_VALUE;
				 count = 0;
			 }
		 }
		 
		 return ans;
	    }
 * 
 * */


