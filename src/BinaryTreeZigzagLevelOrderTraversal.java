import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		if (root == null) {
			return ans;
		}

		int count = 0;
		Queue<TreeNode> temp = new LinkedList<TreeNode>();

		temp.offer(root);

		while (!temp.isEmpty()) {
			count++;
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
			if (count % 2 == 0) {
				Collections.reverse(level);
			}
			ans.add(level);
		}
		return ans;
	}
}
