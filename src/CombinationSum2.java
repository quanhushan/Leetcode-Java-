import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of candidate numbers (candidates) and a target number
 * (target), find all unique combinations in candidates where the candidate
 * numbers sums to target.
 * 
 * Each number in candidates may only be used once in the combination.
 * 
 * Note:
 * 
 * All numbers (including target) will be positive integers. The solution set
 * must not contain duplicate combinations. Example 1:
 * 
 * Input: candidates = [10,1,2,7,6,1,5], target = 8, A solution set is: [ [1,
 * 7], [1, 2, 5], [2, 6], [1, 1, 6] ] Example 2:
 * 
 * Input: candidates = [2,5,2,1,2], target = 5, A solution set is: [ [1,2,2],
 * [5] ]
 */
public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 10, 1, 2, 7, 6, 1, 5 };
		List<List<Integer>> ans = combinationSum2(input, 8);
		for (List<Integer> x : ans) {
			System.out.print("[");
			for (Integer y : x) {
				System.out.print(y);
			}
			System.out.println("],");
		}

	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);

		for (int i = 0; i < candidates.length; ++i) {
			if (i > 0 && candidates[i] == candidates[i - 1]) {
				continue;
			}
			if (candidates[i] > target) {
				break;
			} else if (candidates[i] == target) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(candidates[i]);
				ans.add(temp);
			}
			int[] newCandidates = Arrays.copyOfRange(candidates, i + 1, candidates.length);
			List<List<Integer>> result = combinationSum2(newCandidates, target - candidates[i]);
			for (List<Integer> x : result) {
				x.add(0, candidates[i]);
				ans.add(x);
			}
		}
		return ans;
	}
}
