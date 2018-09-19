import java.util.HashSet;

/*
 *Given a string, find the length of the longest substring without repeating characters.

Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. 
Note that the answer must be a substring, "pwke" is a subsequence and not a substring. 
 */



/*
class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        
    	int i=0;
    	int index;
    	int max=0;
    	int length = s.length();
    	HashSet<Character> temp = new HashSet<Character>();
    	
    	while(i<length) {
    		index = i;
    		int count=0;
    		while(temp.add(s.charAt(index))) {
    			count++;
    			index++;
    			if(count > max) {
    				max = count;
    			}
    			if(index > length-1) {
    				break;
    			}
    		}
    		i++;
    		temp.clear();
    	}
    	return max;
    }
}
*/

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
    	int index=0;
    	int max=0;
       // int count=0;
    	int length = s.length();
    	HashSet<Character> temp = new HashSet<Character>();
    	
    	while(i<length && index<length) {
    		//index = i;
    		//int count=0;
    		if(temp.add(s.charAt(index))) {
    			//count++;
    			index++;
    			if(index - i > max) {
    				max = index - i;
    			}
    			
    		} else{
    		//i++;
    		//temp.clear();
            temp.remove(s.charAt(i++));
                //count = 0;
            }
    	}
    	return max;
    }
}
