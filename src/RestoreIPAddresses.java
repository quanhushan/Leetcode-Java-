import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing only digits, restore it by returning all possible
 * valid IP address combinations.
 * 
 * Example:
 * 
 * Input: "25525511135" Output: ["255.255.11.135", "255.255.111.35"]
 */
public class RestoreIPAddresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> restoreIpAddresses(String s) {

		List<String> ans = new ArrayList<String>();

		for (int a = 1; a < 4; a++) {
			for (int b = 1; b < 4; b++) {
				for (int c = 1; c < 4; c++) {
					for (int d = 1; d < 4; d++) {
						if (a + b + c + d == s.length()) {
							int A = Integer.parseInt(s.substring(0, a));
							int B = Integer.parseInt(s.substring(a, a + b));
							int C = Integer.parseInt(s.substring(a + b, a + b + c));
							int D = Integer.parseInt(s.substring(a + b + c));
							if (A <= 255 && B <= 255 && C <= 255 && D <= 255) {
								StringBuilder temp = new StringBuilder();
								temp.append(String.valueOf(A)).append(".").append(String.valueOf(B)).append(".")
										.append(String.valueOf(C)).append(".").append(String.valueOf(D));
								if (temp.length() - 3 == s.length()) {
									ans.add(temp.toString());
								}
							}
						}
					}
				}
			}
		}
		return ans;
	}

}
