/*
 Given a linked list, swap every two adjacent nodes and return its head.

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
Note:

Your algorithm should use only constant extra space.
You may not modify the values in the list's nodes, only nodes itself may be changed. 
 * */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class SwapNodesinPairs {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	 public ListNode swapPairs(ListNode head) {
	     
		 if(head == null || head.next == null) {
			 return head;
		 }
		 
		 ListNode temp =  new ListNode(-1);
		 temp.next = head;
		 ListNode start = temp;
		 
		 while(temp.next != null && temp.next.next != null) {
			 ListNode a = temp.next;
			 ListNode b = a.next;
			 ListNode c = b.next;
			 
			 temp.next = b;
			 b.next = a;
			 a.next = c;

             temp = a;
		 }
		 
		 return start.next;

	    }
}
