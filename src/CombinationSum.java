import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of candidate numbers (candidates) (without duplicates) and a
 * target number (target), find all unique combinations in candidates where the
 * candidate numbers sums to target.
 * 
 * The same repeated number may be chosen from candidates unlimited number of
 * times.
 * 
 * Note:
 * 
 * All numbers (including target) will be positive integers. The solution set
 * must not contain duplicate combinations. Example 1:
 * 
 * Input: candidates = [2,3,6,7], target = 7, A solution set is: [ [7], [2,2,3]
 * ] Example 2:
 * 
 * Input: candidates = [2,3,5], target = 8, A solution set is: [ [2,2,2,2],
 * [2,3,3], [3,5] ]
 */
public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2, 3, 6, 7 };
		List<List<Integer>> ans = combinationSum(input, 7);
		for (List<Integer> x : ans) {
			System.out.print("[");
			for (Integer y : x) {
				System.out.print(y);
			}
			System.out.println("],");
		}

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);

		for (int i = 0; i < candidates.length; ++i) {
			if (candidates[i] > target) {
				break;
			} else if (candidates[i] == target) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(candidates[i]);
				ans.add(temp);
			}
			int[] newCandidates = Arrays.copyOfRange(candidates, i, candidates.length);
			List<List<Integer>> result = combinationSum(newCandidates, target - candidates[i]);
			for (List<Integer> x : result) {
				x.add(0, candidates[i]);
				ans.add(x);
			}
		}
		return ans;
	}
}
