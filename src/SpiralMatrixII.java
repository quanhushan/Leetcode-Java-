public class SpiralMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 3;
		int[][] ans = generateMatrix(input);
		for (int[] i : ans) {
			for (int j : i) {
				System.out.print(j + ",");
			}
			System.out.println();
		}
	}

	public static int[][] generateMatrix(int n) {

		int[][] ans = new int[n][n];

		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = n - 1;
		int temp = 1;

		while (true) {
			for (int i = left; i <= right; i++) {
				ans[top][i] = temp++;
			}
			top = top + 1;
			if (top > bottom) {
				break;
			}
			for (int j = top; j <= bottom; j++) {
				ans[j][right] = temp++;
			}
			right = right - 1;
			if (right < left) {
				break;
			}
			for (int i = right; i >= left; i--) {
				ans[bottom][i] = temp++;
			}
			bottom = bottom - 1;
			if (bottom < top) {
				break;
			}
			for (int j = bottom; j >= top; j--) {
				ans[j][left] = temp++;
			}
			left = left + 1;
			if (left > right) {
				break;
			}
		}
		return ans;
	}

}
