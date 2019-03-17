
/**
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 * */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		if (root == null) {
			return ans;
		}

		Queue<TreeNode> temp = new LinkedList<TreeNode>();

		temp.offer(root);

		while (!temp.isEmpty()) {
			List<Integer> level = new ArrayList<Integer>();
			for (int i = temp.size(); i > 0; i--) {
				TreeNode node = temp.poll();
				level.add(node.val);
				if (node.left != null) {
					temp.offer(node.left);
				}
				if (node.right != null) {
					temp.offer(node.right);
				}
			}
			ans.add(level);
		}
		return ans;
	}

}
