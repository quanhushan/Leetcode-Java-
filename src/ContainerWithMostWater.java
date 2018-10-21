/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49

 */

public class ContainerWithMostWater {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] input = {2,3,4,5,18,17,6};
		int[] input = {1,2,3,4,5,25,24,3,4};
		System.out.println(maxArea(input));
	}
	
	 public static int maxArea(int[] height) {
		 
		 int i = 0;
		 int j= height.length-1;
		 int tempArea = 0;
		 int area = 0;
		 
		 while(i<j) {
			 tempArea = Math.min(height[i], height[j])*(j-i);
			 if(area < tempArea) {
				 area = tempArea;
			 }
			 if(height[i]<height[j]) {
				 i++;
			 }else {
				 j--;
			 }
			 
		 }
		 
		 return area;
	    }
}
