/**
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * Example 1:
 * 
 * Input: 1->1->2 Output: 1->2 Example 2:
 * 
 * Input: 1->1->2->3->3 Output: 1->2->3
 */
public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode temp = head;

		while (temp.next != null) {
			if (temp.val == temp.next.val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}

		return head;

	}

}
