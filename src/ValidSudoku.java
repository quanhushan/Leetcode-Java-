import java.util.HashSet;
import java.util.Set;

/*
Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

A partially filled sudoku which is valid.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

Example 1:

Input:
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: true
Example 2:

Input:
[
  ["8","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being 
    modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
The given board contain only digits 1-9 and the character '.'.
The given board size is always 9x9.
 * */
public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] input = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		System.out.println(isValidSudoku(input));
	}

	public static boolean isValidSudoku(char[][] board) {

		Set<Character> row = new HashSet<Character>();
		Set<Character> col = new HashSet<Character>();

		for (int i = 0; i < 9; i++) {
			row.clear();
			col.clear();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					if (row.contains(board[i][j])) {
						return false;
					}
					row.add(board[i][j]);
				}
				if (board[j][i] != '.') {
					if (col.contains(board[j][i])) {
						return false;
					}
					col.add(board[j][i]);
				}
				if (i % 3 == 0 && j % 3 == 0) {
					if (!isValidBlock(board, i, j)) {
						return false;
					}
				}
			}
		}

		return true;
	}

	public static boolean isValidBlock(char[][] board, int row, int col) {
		Set<Character> block = new HashSet<Character>();
		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				if (board[i][j] != '.') {
					if (block.contains(board[i][j])) {
						return false;
					}
					block.add(board[i][j]);
				}

			}
		}
		return true;
	}

}
