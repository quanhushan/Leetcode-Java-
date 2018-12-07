/**
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 * 
 * Example 1:
 * 
 * Input: 2.00000, 10 Output: 1024.00000 Example 2:
 * 
 * Input: 2.10000, 3 Output: 9.26100 Example 3:
 * 
 * Input: 2.00000, -2 Output: 0.25000 Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */
public class PowXN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(myPow(2.00000, 6));

	}

	public static double myPow(double x, int n) {

		double ans = 1.0;
		int temp = n;
		if (temp < 0) {
			n = -1 * n;
		}

		for (int i = n; i != 0; i /= 2) {
			if (i % 2 != 0) {
				ans = ans * x;
			}
			x = x * x;
		}

		if (temp < 0) {
			return 1 / ans;
		}
		return ans;
	}

}
