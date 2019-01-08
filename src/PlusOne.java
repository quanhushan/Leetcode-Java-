/**
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contain a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example 1:
 * 
 * Input: [1,2,3] Output: [1,2,4] Explanation: The array represents the integer
 * 123. Example 2:
 * 
 * Input: [4,3,2,1] Output: [4,3,2,2] Explanation: The array represents the
 * integer 4321.
 */
public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 9, 9, 9, 9 };
		int[] ans = plusOne(input);
		for (int i : ans) {
			System.out.print(i);
		}
	}

	public static int[] plusOne(int[] digits) {
		int length = digits.length;
		for (int i = length - 1; i >= 0; --i) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] ans = new int[length + 1];
		ans[0] = 1;
		return ans;
	}

}
