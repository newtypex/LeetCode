// Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum.
// Memory Usage: 39.6 MB, less than 16.16% of Java online submissions for Two Sum.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode temp;
        if (l1==null) {
            return l2;
        }
        else if (l2==null) {
            return l1;
        }
        else {
            if (l1.val<l2.val) {
                head = new ListNode(l1.val);
                temp = head;
                l1 = l1.next;
            }
            else {
                head = new ListNode(l2.val);
                temp = head;
                l2 = l2.next;
            }
            
        }
        
        while (true) {
            if (l1==null) {
                temp.next = l2;
                break;
            }
            else if (l2==null) {
                temp.next = l1;
                break;
            }
            else {
                if (l1.val < l2.val) {
                        temp.next = l1;
                        temp = l1;
                        l1 = l1.next;                        
                    }
                    else {
                        temp.next = l2;
                        temp = l2;
                        l2 = l2.next;                        
                    }

            }
            
        }
        return head;
        
    }
}