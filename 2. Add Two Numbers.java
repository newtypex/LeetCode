// Runtime: 2 ms, faster than 78.92% of Java online submissions for Add Two Numbers.
// Memory Usage: 43.2 MB, less than 88.71% of Java online submissions for Add Two Numbers.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode current = head;
            
        while (true) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }

            current.next = new ListNode(carry%10);
            current = current.next;
            
            carry = carry/10;
            if (l1==null && l2==null && carry== 0) break;
        }
        return head.next;
    }
    
}