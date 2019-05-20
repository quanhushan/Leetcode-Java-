/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
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
public class ConvertSortedListtoBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedListToBST(ListNode head) {

		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return new TreeNode(head.val);
		}

		ListNode slow = head;
		ListNode fast = head;
		ListNode last = slow;

		while (fast.next != null && fast.next.next != null) {
			last = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		fast = slow.next;
		last.next = null;
		TreeNode cur = new TreeNode(slow.val);

		if (head != slow) {
			cur.left = sortedListToBST(head);
		}
		cur.right = sortedListToBST(fast);

		return cur;

	}

}
