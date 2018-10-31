/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:

Although the above answer is in lexicographical order, your answer could be in any order you want.
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCombinations("234"));
	}

	 public static List<String> letterCombinations(String digits) {
		 
	     List<String> ans = new ArrayList<>();
	        if (digits.length() == 0) {
	            return ans;
	        }
	        
		 String[][] mappingList = new String[][]{
	            {"a", "b", "c"},
	            {"d", "e", "f"},
	            {"g", "h", "i"},
	            {"j", "k", "l"},
	            {"m", "n", "o"},
	            {"p", "q", "r", "s"},
	            {"t", "u", "v"},
	            {"w", "x", "y", "z"},
	        };
	        
	        int first = Integer.valueOf(digits.substring(0, 1)) - 2;
	        String[] temp = mappingList[first];
	        
	        if (digits.length() == 1) {
	            ans.addAll(Arrays.asList(temp));
	            return ans;
	        }

	        List<String> tempList = letterCombinations(digits.substring(1));

	        for (String left : temp) {
	            for (String right : tempList) {
	                ans.add(left + right);
	            }
	        }
	        return ans;
	    }
	
	
}
