/**
 * 
 * Given two binary strings, return their sum (also a binary string).
 * 
 * The input strings are both non-empty and contains only characters 1 or 0.
 * 
 * Example 1:
 * 
 * Input: a = "11", b = "1" Output: "100" Example 2:
 * 
 * Input: a = "1010", b = "1011" Output: "10101"
 */
public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {

		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		String ans = "";

		while (i >= 0 || j >= 0) {
			int x, y, tempSum;
			if (i >= 0) {
				x = a.charAt(i) - '0';
			} else {
				x = 0;
			}

			if (j >= 0) {
				y = b.charAt(j) - '0';
			} else {
				y = 0;
			}
			i--;
			j--;
			tempSum = x + y + carry;
			ans = tempSum % 2 + ans;
			carry = tempSum / 2;
		}

		if (carry == 1) {
			ans = 1 + ans;
		}
		return ans;
	}

}
