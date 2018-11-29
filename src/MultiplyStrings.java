/**
 * Given two non-negative integers num1 and num2 represented as strings, return
 * the product of num1 and num2, also represented as a string.
 * 
 * Example 1:
 * 
 * Input: num1 = "2", num2 = "3" Output: "6" Example 2:
 * 
 * Input: num1 = "123", num2 = "456" Output: "56088" Note:
 * 
 * The length of both num1 and num2 is < 110. Both num1 and num2 contain only
 * digits 0-9. Both num1 and num2 do not contain any leading zero, except the
 * number 0 itself. You must not use any built-in BigInteger library or convert
 * the inputs to integer directly.*
 * 
 */
public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiply("123", "456"));
	}

	public static String multiply(String num1, String num2) {

		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}

		int x = num1.length();
		int y = num2.length();

		int[] temp = new int[x + y];

		int k = x + y - 2;

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				temp[k - i - j] = temp[k - i - j] + (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
			}
		}
		int carry = 0;
		for (int i = 0; i < x + y; i++) {
			temp[i] = temp[i] + carry;
			carry = temp[i] / 10;
			temp[i] = temp[i] % 10;
		}

		int z = x + y - 1;
		if (temp[x + y - 1] == 0) {
			z--;
		}

		StringBuilder ans = new StringBuilder();
		for (int i = z; i >= 0; i--) {
			ans.append(temp[i]);
		}

		return ans.toString();
	}

}

/**
Hint

                          1        2          3
                     X    4        5          6
----------------------------------------------------
                        1*6=6    2*6=12     3*6=18
                5        10        15
        4       8        12
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        4       13         28        27          18
        4       13         28        28           8
        4       13         30         8           8
        4       16          0         8           8
        5        6          0         8           8   
* */