import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
		Collections.reverse(ans);
		return ans;
	}

}
