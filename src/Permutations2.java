import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a collection of numbers that might contain duplicates, return all
 * possible unique permutations.
 * 
 * Example:
 * 
 * Input: [1,1,2] Output: [ [1,1,2], [1,2,1], [2,1,1] ]
 */

public class Permutations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 1, 2 };
		List<List<Integer>> ans = permuteUnique(input);
		for (List<Integer> x : ans) {
			System.out.print("[");
			for (Integer y : x) {
				System.out.print(y);
			}
			System.out.println("]");
		}
	}

	public static List<List<Integer>> permuteUnique(int[] nums) {

		List<Integer> right = new ArrayList<Integer>();
		for (int num : nums) {
			right.add(num);
		}
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> left = new ArrayList<Integer>();
		Set<List<Integer>> set = new HashSet<>();

		DFS(left, right, right.size(), set);
		ans.addAll(set);
		return ans;
	}

	private static void DFS(List<Integer> left, List<Integer> right, int length, Set<List<Integer>> ans) {
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
