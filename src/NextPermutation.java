/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
 * */
public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2};
		nextPermutation(input);
	}
	
	public static void nextPermutation(int[] nums) {
		
		int end = nums.length - 1;
		int i = end - 1;
		
		while(i >= 0 && nums[i] >= nums[i+1]) {
			i--;
		}
        
		if(i >= 0) {
			int j = end;
			while(j >= 0 && nums[i] >= nums[j]) {
				j--;
			}
			swap(nums,i,j);
		}
		
		reverse(nums,i+1,end);
		
		for(int x:nums) {
			System.out.println(x);
		}
    }
	
	private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
	
	 private static void reverse(int[] nums, int i, int end) {
	        int  j = end;
	        while (i < j) {
	            swap(nums, i, j);
	            i++;
	            j--;
	        }
	    }
	

}
