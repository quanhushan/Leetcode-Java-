/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 * */
public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 5, 7, 7, 8, 8, 10 };
		int[] temp = searchRange(input, 8);
		for (int x : temp) {
			System.out.println(x);
		}
	}

	public static int[] searchRange(int[] nums, int target) {

		int[] temp = { -1, -1 };
		if (nums.length == 0) {
			return temp;
		}

		int i, j;
		int left = 0;
		int right = nums.length;
		int index = -1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				index = mid;
				break;
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

		if (index == -1) {
			return temp;
		} else {
			i = index;
			j = index;
			while (i > 0 && nums[i - 1] == target) {
				i--;
			}
			while (j < nums.length - 1 && nums[j + 1] == target) {
				j++;
			}
			return new int[] { i, j };
		}

	}

}
