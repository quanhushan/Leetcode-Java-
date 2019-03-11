/**
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
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

public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {

		Queue<TreeNode> temp = new LinkedList<TreeNode>();

		temp.offer(p);
		temp.offer(q);

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
			temp.offer(node2.left);
			temp.offer(node1.right);
			temp.offer(node2.right);
		}
		return true;
	}

}
