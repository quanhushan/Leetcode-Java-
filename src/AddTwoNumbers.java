/*
 You are given two non-empty linked lists representing two non-negative integers. 
 The digits are stored in reverse order and each of their nodes contain a single digit. 
 Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 
class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1);
        ListNode cur = temp;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int temp1;
            int temp2;
            int sum;
            if(l1 == null){
                temp1 = 0;
            } else {
                temp1 = l1.val;
            }
             if(l2 == null){
                temp2 = 0;
            } else {
                temp2 = l2.val;
            }
              sum = temp1 + temp2 + carry;
            if(sum >= 10){
            carry = 1;
            }else {
            carry = 0;    
            }
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null){ 
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (carry == 1){
            cur.next = new ListNode(1);
        }
        return temp.next;
    }
}