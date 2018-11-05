/*
 Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass? 
  
 * */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class RemoveNthNodeFromEndofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        
		ListNode start1 = head;
		ListNode start2 = head;
		
		while(n != 0) {
			n--;
			start1 = start1.next;
		}
		if(start1 == null) {
			return head.next;
		}
		while(start1.next != null) {
			start1 = start1.next;
			start2 = start2.next;
		}
		
		start2.next = start2.next.next;
		
		return head;
    }

}
