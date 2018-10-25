/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z. 
 * /
 */
public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flowe","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		if(strs == null ||strs.length == 0) {
			return "";
		}
		
		int min = strs[0].length();
		boolean flg = true;
		
		for(String str:strs) {
			if(str == null || str.length() == 0) {
			return "";	
			}
			if(min > str.length()) {
				min = str.length();
			}
		}
		int i;
		for(i = 0; i < min; i++) {
			for(int j = 1; j < strs.length;j++) {
				if(strs[0].charAt(i) != strs[j].charAt(i)) {
					flg = false;
					break;
				}
			}
			if(!flg) {
				break;
			}
		}
        return strs[0].substring(0, i);
    }
}

/*
 public static String longestCommonPrefix(String[] strs) {
		
		if(strs == null ||strs.length == 0) {
			return "";
		}
		String temp = strs[0]; 
		for(int i = 1; i < strs.length;i++ ) {
			while(strs[i].indexOf(temp) != 0) {
				temp = temp.substring(0, temp.length()-1);
			}
		}
		
		if(temp.isEmpty()) {
			return "";
		}
		
        return temp;
    } 
 
 */