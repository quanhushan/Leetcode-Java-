/**
 * A message containing letters from A-Z is being encoded to numbers using the
 * following mapping:
 * 
 * 'A' -> 1 'B' -> 2 ... 'Z' -> 26 Given a non-empty string containing only
 * digits, determine the total number of ways to decode it.
 * 
 * Example 1:
 * 
 * Input: "12" Output: 2 Explanation: It could be decoded as "AB" (1 2) or "L"
 * (12). Example 2:
 * 
 * Input: "226" Output: 3 Explanation: It could be decoded as "BZ" (2 26), "VF"
 * (22 6), or "BBF" (2 2 6).
 */
public class DecodeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numDecodings("136"));
	}

	public static int numDecodings(String s) {

		if (s.length() == 0 || s.charAt(0) == '0') {
			return 0;
		}
		int dp1 = 1;
		int dp2 = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				dp1 = 0;
			}
			if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6')) {
				dp1 = dp1 + dp2;
				dp2 = dp1 - dp2;
			} else {
				dp2 = dp1;
			}
		}
		return dp1;

	}

}
