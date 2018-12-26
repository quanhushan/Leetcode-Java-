/**
 * 
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in
 * the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in
 * the diagram below).
 * 
 * Now consider if some obstacles are added to the grids. How many unique paths
 * would there be?
 * 
 * 
 * 
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * 
 * Note: m and n will be at most 100.
 * 
 * Example 1:
 * 
 * Input: [ [0,0,0], [0,1,0], [0,0,0] ] Output: 2 Explanation: There is one
 * obstacle in the middle of the 3x3 grid above. There are two ways to reach the
 * bottom-right corner: 1. Right -> Right -> Down -> Down 2. Down -> Down ->
 * Right -> Right
 */
public class UniquePaths2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int row = obstacleGrid.length;
		int column = obstacleGrid[0].length;
		int[][] dp = new int[100][100];

		for (int i = 0; i < row; i++) {
			if (obstacleGrid[i][0] == 0) {
				dp[i][0] = 1;
			} else {
				break;
			}
		}
		for (int i = 0; i < column; i++) {
			if (obstacleGrid[0][i] == 0) {
				dp[0][i] = 1;
			} else {
				break;
			}
		}

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < column; j++) {
				if (obstacleGrid[i][j] == 0) {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				} else {
					dp[i][j] = 0;
				}
			}
		}

		return dp[row - 1][column - 1];
	}
}