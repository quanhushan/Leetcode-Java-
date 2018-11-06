import java.util.ArrayList;
import java.util.List;

/*
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true 
 
 * */
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{[]}";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		
		char[] temp = new char[s.length()];
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			switch(c) {
			case '(':
				temp[count++] = '(';
				break;
			case '[':
				temp[count++] = '[';
				break;
			case '{':
				temp[count++] = '{';
				break;
			case ')':
				if(count <= 0) {
					return false;
				}
				if(temp[--count] != '(' ) {
					return false;
				}
				break;
			case ']':
				if(count <= 0) {
					return false;
				}
				if(temp[--count] != '[' ) {
					return false;
				}
				break;
			case '}':
				if(count <= 0) {
					return false;
				}
				if(temp[--count] != '{' ) {
					return false;
				}
				break;
			}
			
		}
		
		if(count != 0) {
			return false;
			} else {
				return true;
			}
	}
}


//bad performance
/* 
 public static boolean isValid(String s) {
		
		List<String> left = new ArrayList<String>();
		List<String> right = new ArrayList<String>();
     
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			boolean flg = false;
			
			switch(c) {
			case '(':
				left.add("(");
				break;
			case '[':
				left.add("[");
				break;
			case '{':
				left.add("{");
				break;
			case ')':
				right.add(")");
				flg = true;
				break;
			case ']':
				right.add("]");
				flg = true;
				break;
			case '}':
				right.add("}");
				flg = true;
				break;
			}
			
			if(!left.isEmpty() && flg) {
				String temp = left.get(left.size() - 1)+right.get(0);
				if(temp.equals("()")  || temp.equals("[]") || temp.equals("{}")) {
					left.remove(left.size() - 1);
					right.remove(0);
				} else {
					return false;
				}
			}
			
		}
		
		if(left.size() != right.size() || left.size() > 0) {
			return false;
		} else {
			return true;
		}
    }

 * */
