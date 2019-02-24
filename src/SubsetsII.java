import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a collection of integers that might contain duplicates, nums, return
 * all possible subsets (the power set).
 * 
 * Note: The solution set must not contain duplicate subsets.
 * 
 * Example:
 * 
 * Input: [1,2,2] Output: [ [2], [1], [1,2,2], [2,2], [1,2], [] ]
 */
public class SubsetsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 2, 2 };
		System.out.print(subsetsWithDup(input));

	}

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		ans.add(new ArrayList<Integer>());

		for (int i = 0; i < nums.length; i++) {
			List<List<Integer>> temp = new ArrayList<List<Integer>>();
			temp.addAll(ans);

			for (List<Integer> list : temp) {
				List<Integer> newList = new ArrayList<>();
				newList.addAll(list);
				newList.add(nums[i]);
				ans.add(newList);
			}
		}

		Set<List<Integer>> set = new HashSet<List<Integer>>();
		List<List<Integer>> ans2 = new ArrayList<List<Integer>>();
		for (List<Integer> list : ans) {
			Collections.sort(list);
			if (set.add(list)) {
				ans2.add(list);
			}

		}

		return ans2;
	}

}
