import java.util.ArrayList;
import java.util.List;

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 * */
public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(3));
	}

	public static List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
	        generateAll(new char[2 * (n-1)], 0, result);
	        return result;
   }
   
   
    public static void generateAll(char[] current, int temp, List<String> result) {
        
	        if (temp == current.length) {
	            if (check(current)) {
	                result.add("(" + new String(current) + ")");
	            }
	        } else {
	            current[temp] = '(';
	            generateAll(current, temp + 1, result);
	            current[temp] = ')';
	            generateAll(current, temp + 1, result);
	        }
	    }
	 
	 public static boolean check(char[] current) {
        
	        int nums = 0;
	        for (char c : current) {
	            if (c == '(') {
	                nums++;
	            } else {
	                nums--;
	            }
	            if (nums < -1)
	                return false;
	        }
	        return (nums == 0);
	    }

	
}
