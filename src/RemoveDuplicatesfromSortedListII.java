/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * 
 * Example 1:
 * 
 * Input: 1->2->3->3->4->4->5 Output: 1->2->5 Example 2:
 * 
 * Input: 1->1->1->2->3 Output: 2->3
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class RemoveDuplicatesfromSortedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode temp = new ListNode(-1);
		temp.next = head;
		ListNode pre = temp;

		while (pre.next != null) {
			ListNode cur = pre.next;
			while (cur.next != null && cur.next.val == cur.val) {
				cur = cur.next;
			}
			if (cur != pre.next) {
				pre.next = cur.next;
			} else {
				pre = pre.next;
			}
		}
		return temp.next;

	}

}
