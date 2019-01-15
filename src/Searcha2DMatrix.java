/**
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right. The first integer of each
 * row is greater than the last integer of the previous row. Example 1:
 * 
 * Input: matrix = [ [1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50] ] target =
 * 3 Output: true Example 2:
 * 
 * Input: matrix = [ [1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50] ] target =
 * 13 Output: false
 */
public class Searcha2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int m = matrix.length;
		int n = matrix[0].length;

		if (target < matrix[0][0] || target > matrix[m - 1][n - 1]) {
			return false;
		}

		int left = 0, right = m * n - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (matrix[mid / n][mid % n] == target) {
				return true;
			} else if (matrix[mid / n][mid % n] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}
}
