/**
 * Given a linked list and a value x, partition it such that all nodes less than
 * x come before nodes greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the
 * two partitions.
 * 
 * Example:
 * 
 * Input: head = 1->4->3->2->5->2, x = 3 Output: 1->2->2->4->3->5
 */
public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode partition(ListNode head, int x) {

		if (head == null) {
			return head;
		}
		ListNode a = new ListNode(-1);
		ListNode b = new ListNode(-1);
		a.next = head;
		ListNode cur = a;
		ListNode newList = b;

		while (cur.next != null) {
			if (cur.next.val < x) {
				newList.next = cur.next;
				newList = newList.next;
				cur.next = cur.next.next;
				newList.next = null;
			} else {
				cur = cur.next;
			}
		}

		newList.next = a.next;

		return b.next;

	}

}
