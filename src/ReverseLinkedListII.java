/**
 * Reverse a linked list from position m to n. Do it in one-pass.
 * 
 * Note: 1 ≤ m ≤ n ≤ length of list.
 * 
 * Example:
 * 
 * Input: 1->2->3->4->5->NULL, m = 2, n = 4 Output: 1->4->3->2->5->NULL
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class ReverseLinkedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseBetween(ListNode head, int m, int n) {

		ListNode temp = new ListNode(-1);
		temp.next = head;
		ListNode pre = temp;

		for (int i = 0; i < m - 1; i++) {
			pre = pre.next;
		}

		ListNode cur = pre.next;

		for (int i = m; i < n; i++) {
			ListNode breakPoint = cur.next;
			cur.next = breakPoint.next;
			breakPoint.next = pre.next;
			pre.next = breakPoint;
		}
		return temp.next;
	}
}
