/*
 Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums
  such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:

The solution set must not contain duplicate quadruplets.

Example:

Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
 * */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,0,-1,0,-2,2}; 
				System.out.println(fourSum(input,0));
	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int n = nums.length;
		if(n < 3) {
			return ans;
		}
		Arrays.sort(nums);
		
		for(int i = 0; i< n - 3; i++) {
			
			 if(nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) {
				 break;
			 }
		     if(nums[n-1] + nums[n-2] + nums[n-3] + nums[i]< target) {
		    	 continue;
		     }
		        
			for(int j = i + 1; j < n - 2; j++) {
				int l = j+1;
				int r = n - 1;
				if(nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) {
					break;
				}
			     if(nums[n-1] + nums[n-2] + nums[j] + nums[i]< target) {
			    	 continue;
			     }
				while(l < r) {
					int sum = nums[i] + nums[j] + nums[l] + nums[r];
					List<Integer> temp = new ArrayList<Integer>();
					if(sum == target) {
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[l]);
						temp.add(nums[r]);
						ans.add(temp);
						l++;
						r--;
						while(l < r && nums[l-1] == nums[l]) {
							l++;
						}
						while(l < r && nums[r] == nums[r+1]) {
								r--;
						}
					}
					else if(sum <= target) {
						l++;
					} else {
						r--;
					}
					while(i < n-1 && nums[i] == nums[i+1]) {
						i++;
						}
					while(j < n-1 && nums[j] == nums[j+1]) {
						j++;
						}
				}
			}
		}
		
		return ans;
    }

}
