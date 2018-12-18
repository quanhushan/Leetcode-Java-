import java.util.LinkedList;
import java.util.List;

/**
 * The set [1,2,3,...,n] contains a total of n! unique permutations.
 * 
 * By listing and labeling all of the permutations in order, we get the
 * following sequence for n = 3:
 * 
 * "123" "132" "213" "231" "312" "321" Given n and k, return the kth permutation
 * sequence.
 * 
 * Note:
 * 
 * Given n will be between 1 and 9 inclusive. Given k will be between 1 and n!
 * inclusive. Example 1:
 * 
 * Input: n = 3, k = 3 Output: "213" Example 2:
 * 
 * Input: n = 4, k = 9 Output: "2314"
 */
public class PermutationSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPermutation(3, 3));
	}

	public static String getPermutation(int n, int k) {
		List<Integer> nList = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			nList.add(i);
		}

		int[] fact = new int[n];
		fact[0] = 1;
		for (int i = 1; i < n; i++) {
			fact[i] = i * fact[i - 1];
		}

		k--;
		StringBuilder ans = new StringBuilder();
		for (int i = n; i >= 1; i--) {
			int j = k / fact[i - 1];
			k = k % fact[i - 1];
			ans.append(nList.get(j));
			nList.remove(j);
		}
		return ans.toString();

	}

}
