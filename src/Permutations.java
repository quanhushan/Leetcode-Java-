import java.util.ArrayList;
import java.util.List;

/**
 * Given a collection of distinct integers, return all possible permutations.
 * 
 * Example:
 * 
 * Input: [1,2,3] Output: [ [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]
 * ]
 */

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 2 };
		List<List<Integer>> ans = permute(input);
		for (List<Integer> x : ans) {
			System.out.print("[");
			for (Integer y : x) {
				System.out.print(y);
			}
			System.out.println("]");
		}
	}

	public static List<List<Integer>> permute(int[] nums) {

		List<Integer> right = new ArrayList<Integer>();
		for (int num : nums) {
			right.add(num);
		}
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> left = new ArrayList<Integer>();
		DFS(left, right, right.size(), ans);
		return ans;
	}

	private static void DFS(List<Integer> left, List<Integer> right, int length, List<List<Integer>> ans) {
		if (left.size() == length) {
			ans.add(left);
			return;
		}

		for (int i = 0; i < right.size(); i++) {
			List<Integer> newLeft = new ArrayList<Integer>(left);
			List<Integer> newRight = new ArrayList<Integer>(right);
			newLeft.add(right.get(i));
			newRight.remove(i);
			DFS(newLeft, newRight, length, ans);
		}
	}

}
