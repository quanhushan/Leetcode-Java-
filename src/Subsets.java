import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets (the
 * power set).
 * 
 * Note: The solution set must not contain duplicate subsets.
 * 
 * Example:
 * 
 * Input: nums = [1,2,3] Output: [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2],
 * [] ]
 */
public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 2, 3 };
		System.out.print(subsets(input));
	}

	public static List<List<Integer>> subsets(int[] nums) {
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
		return ans;

	}

}
