/**
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space
 * characters only.
 * 
 * Example:
 * 
 * Input: "Hello World" Output: 5
 */
public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "   aa a aa aa   ";
		System.out.print(lengthOfLastWord(input));

	}

	public static int lengthOfLastWord(String s) {

		if (s == null || s.equals("")) {
			return 0;
		}

		return s.trim().length() - s.trim().lastIndexOf(" ") - 1;

	}

}
