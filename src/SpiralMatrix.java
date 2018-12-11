import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * Example 1:
 * 
 * Input: [ [ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ] ] Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 * 
 * Input: [ [1, 2, 3, 4], [5, 6, 7, 8], [9,10,11,12] ] Output:
 * [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int input[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int input[][] = new int[][] {};
		List<Integer> ans = spiralOrder(input);
		for (Integer i : ans) {
			System.out.print(i);
		}
	}

	public static List<Integer> spiralOrder(int[][] matrix) {

		if (matrix.length == 0 || matrix[0].length == 0) {
			return new ArrayList<Integer>();
		}

		int m = matrix.length;
		int n = matrix[0].length;
		List<Integer> ans = new ArrayList<Integer>();

		int top = 0;
		int bottom = m - 1;
		int left = 0;
		int right = n - 1;

		while (true) {
			for (int i = left; i <= right; i++) {
				ans.add(matrix[top][i]);
			}
			top = top + 1;
			if (top > bottom) {
				break;
			}
			for (int j = top; j <= bottom; j++) {
				ans.add(matrix[j][right]);
			}
			right = right - 1;
			if (right < left) {
				break;
			}
			for (int i = right; i >= left; i--) {
				ans.add(matrix[bottom][i]);
			}
			bottom = bottom - 1;
			if (bottom < top) {
				break;
			}
			for (int j = bottom; j >= top; j--) {
				ans.add(matrix[j][left]);
			}
			left = left + 1;
			if (left > right) {
				break;
			}
		}
		return ans;
	}

}
