// Runtime: 0 ms, faster than 100.00% of Java online submissions
// Memory Usage: 36.6 MB, less than 79.29% of Java online submissions

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB==null) return null;
        int lenA = 0;
        int lenB = 0;
        ListNode a = headA;
        ListNode b = headB;
        while (a != null) {
            lenA += 1;
            a = a.next;
        }
        while (b != null) {
            lenB += 1;
            b = b.next;
        }
        
        if (lenA>lenB) {
            for (int i=0; i<(lenA-lenB);i++) headA = headA.next;
        }
        else if (lenB>lenA) {
            for (int i=0; i<(lenB-lenA);i++) headB = headB.next;
        }
        
        while (true) {
            if (headA==null) return null;
            else if (headA==headB) return headA;
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }
    }
}