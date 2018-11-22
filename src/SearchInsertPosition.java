/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
 * */
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 3, 5, 6 };
		System.out.println(searchInsert(input, 0));

	}

	public static int searchInsert(int[] nums, int target) {

		if (nums.length == 0 || target < nums[0]) {
			return 0;
		}

		int left = 0;
		int right = nums.length;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				if (right == mid) {
					break;
				}
				right = mid;
			} else {
				if (left == mid) {
					break;
				}
				left = mid;
			}
		}

		return left + 1;
	}

}
