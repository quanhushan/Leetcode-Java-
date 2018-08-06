import java.util.HashMap;
import java.util.Map;

/*
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]. 
 * */


/*
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tempNums = {2, 7, 11, 15};
		int tempTarget = 9;
		
		twoSum(tempNums,tempTarget);
	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        int [] ans = new int[2];
	        Map <Integer,Integer> map = new HashMap<>();
	        
	        if(nums == null || nums.length <=1) {
	        	return ans;
	        }
	        
	        for(int i=0; i<nums.length; i++) {
	        map.put(nums[i],i);	
	        }
	        
	        for(int i=0; i<nums.length; i++) {
	        	if(map.containsKey(target - nums[i])) {
	        		ans[0] = i;
	        		ans[1] = map.get(target - nums[i]);	
	        	}
	        	if(ans[0] != ans[1]){
	                break;
	                }
	        }
	        
	        System.out.println(ans[0] + "," +ans[1]);
	        return ans;
	    }

}
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
	        Map <Integer,Integer> map = new HashMap<>();
	        
	        if(nums == null || nums.length <=1) {
	        	return ans;
	        }
	        
	        for(int i=0; i<nums.length; i++) {
	        map.put(nums[i],i);	
	        }
	        
	        for(int i=0; i<nums.length; i++) {
	        	if(map.containsKey(target - nums[i])) {
	        		ans[0] = i;
	        		ans[1] = map.get(target - nums[i]);
	        	}
                if(ans[0] != ans[1]){
	                break;
	                }
	        }
	        
	        return ans;
    }
}
 
