// Runtime: 2 ms, faster than 38.34% of Java online submissions
// Memory Usage: 38.9 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode head2 = null;
        ListNode pointer = head;
        while (pointer != null) {
            ListNode temp = new ListNode(pointer.val);
            temp.next = head2;
            head2 = temp;
            
            pointer = pointer.next;
        }
        
        while (head != null) {
            if (head.val != head2.val)  return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
}