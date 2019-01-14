/**
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x, where x is guaranteed to be a
 * non-negative integer.
 * 
 * Since the return type is an integer, the decimal digits are truncated and
 * only the integer part of the result is returned.
 * 
 * Example 1:
 * 
 * Input: 4 Output: 2 Example 2:
 * 
 * Input: 8 Output: 2 Explanation: The square root of 8 is 2.82842..., and since
 * the decimal part is truncated, 2 is returned.
 */
public class SqrtX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(mySqrt(8));
	}

	public static int mySqrt(int x) {
		long ans = x;
		while (ans * ans > x) {
			ans = (ans + x / ans) / 2;
		}
		return (int) ans;
	}

}
