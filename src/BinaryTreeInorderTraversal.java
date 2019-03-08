/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * Example:
 * 
 * Input: [1,null,2,3] 1 \ 2 / 3
 * 
 * Output: [1,3,2] Follow up: Recursive solution is trivial, could you do it
 * iteratively?
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<Integer>();

		inorder(root, ans);

		return ans;
	}

	private void inorder(TreeNode root, List<Integer> ans) {
		if (root == null) {
			return;
		}
		if (root.left != null) {
			inorder(root.left, ans);
		}

		ans.add(root.val);

		if (root.right != null) {
			inorder(root.right, ans);
		}
	}

}
