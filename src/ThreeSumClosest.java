import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. 
Return the sum of the three integers. You may assume that each input would have exactly one solution.

Example:

Given array nums = [-1, 2, 1, -4], and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

 */
public class ThreeSumClosest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {-1,2,1,-4};
		int target = 2;
				System.out.println(threeSumClosest(input,target));
		}

	 public static int threeSumClosest(int[] nums, int target) {

		 Arrays.sort(nums);
		int ans = 0;
		 int minDistance = Integer.MAX_VALUE;
		
		 for(int i = 0; i< nums.length - 2; i++) {
				int j = i+1;
				int k = nums.length - 1;
				while(j < k) {
					int tempSum = nums[i] + nums[j] + nums[k];
					int tempAns;
					if(tempSum < target) {
						tempAns = target - tempSum;
						if(tempAns < minDistance) {
							minDistance = tempAns;
							ans = tempSum;
						}
						j++;
					} else if(tempSum > target) {
						tempAns = tempSum - target;
						if(tempAns < minDistance) {
							minDistance = tempAns;
							ans = tempSum;
						}
						k--;
					} else {
						return tempSum;
					}
				}
			}
			
			return ans;
	    }
}
