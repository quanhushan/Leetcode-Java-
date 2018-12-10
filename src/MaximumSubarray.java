/**
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation: [4,-1,2,1] has the
 * largest sum = 6. Follow up:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.print(maxSubArray(input));
	}

	public static int maxSubArray(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int ans = Integer.MIN_VALUE;
		int tempSum = 0;
		for (int num : nums) {
			tempSum = Math.max(tempSum + num, num);
			ans = Math.max(ans, tempSum);
		}
		return ans;
	}

}
