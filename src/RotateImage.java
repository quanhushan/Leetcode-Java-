/**
 * You are given an n x n 2D matrix representing an image.
 * 
 * Rotate the image by 90 degrees (clockwise).
 * 
 * Note:
 * 
 * You have to rotate the image in-place, which means you have to modify the
 * input 2D matrix directly. DO NOT allocate another 2D matrix and do the
 * rotation.
 * 
 * Example 1:
 * 
 * Given input matrix = [ [1,2,3], [4,5,6], [7,8,9] ],
 * 
 * rotate the input matrix in-place such that it becomes: [ [7,4,1], [8,5,2],
 * [9,6,3] ] Example 2:
 * 
 * Given input matrix = [ [ 5, 1, 9,11], [ 2, 4, 8,10], [13, 3, 6, 7],
 * [15,14,12,16] ],
 * 
 * rotate the input matrix in-place such that it becomes: [ [15,13, 2, 5], [14,
 * 3, 4, 1], [12, 6, 8, 9], [16, 7,10,11] ]
 */
public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(data);
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void rotate(int[][] matrix) {
		int length = matrix.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i; j++) {
				swap(i, j, length, matrix);
			}
		}

		for (int i = 0; i < length / 2; i++) {
			for (int j = 0; j < length; j++) {
				swap2(i, j, length, matrix);
			}
		}

	}

	private static void swap(int i, int j, int length, int[][] matrix) {
		int temp = matrix[i][j];
		matrix[i][j] = matrix[length - 1 - j][length - 1 - i];
		matrix[length - 1 - j][length - 1 - i] = temp;
	}

	private static void swap2(int i, int j, int length, int[][] matrix) {
		int temp = matrix[i][j];
		matrix[i][j] = matrix[length - 1 - i][j];
		matrix[length - 1 - i][j] = temp;
	}

}


/**Hint
1  2  3        9  6  3        7  4  1

4  5  6   ->   8  5  2   ->   8  5  2 

7  8  9        7  4  1        9  6  3
 * */
