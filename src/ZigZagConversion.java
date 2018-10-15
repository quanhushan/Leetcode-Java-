/*
 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
 (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I

 * 
 * */




public class ZigZagConversion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("ABCD",2));
	}
	
	 public static String convert(String s, int numRows) {
		 if (numRows == 1) return s;
		 int length = s.length();
		 char tmp[][] =  new char[numRows][length];
		 StringBuilder ans = new StringBuilder();
		 int i =0;
		 int j = 0;
		 int count = 0;
		 boolean flg = false;
		 while(length > count) {
			 if(i < numRows && !flg) {
				 tmp[i][j] = s.charAt(count);
				 	i++; 
			 }
			 if(i>=0 && flg) {
				 tmp[i][j] = s.charAt(count);
				 if(i==0) {
					 i++;
				 }else {
				 	i--; 
				 	j++;
				 }
			 }
			 if(i == numRows) {
				 flg = true;
				 j++;
				 i=i-2;
			 } else if(i == 0) {
				 flg = false;
			 }
			 count++;
		 }
		 for(int m=0;m < numRows;m++) {
			 for(int n = 0; n <= j; n++) {
				 if(tmp[m][n] != '\0') {
					 ans.append(tmp[m][n]);
				 }
				 
			 }
			 
		 }
		 return ans.toString();
	    }
	

}
