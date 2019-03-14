
/**
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
 * */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSymmetric(TreeNode root) {

		if (root == null) {
			return true;
		}

		Queue<TreeNode> temp = new LinkedList<TreeNode>();

		temp.offer(root.left);
		temp.offer(root.right);

		while (!temp.isEmpty()) {
			TreeNode node1 = temp.poll();
			TreeNode node2 = temp.poll();

			if (node1 == null && node2 == null) {
				continue;
			}
			if (node1 == null || node2 == null || node1.val != node2.val) {
				return false;
			}
			temp.offer(node1.left);
			temp.offer(node2.right);
			temp.offer(node1.right);
			temp.offer(node2.left);
		}
		return true;

	}
}
