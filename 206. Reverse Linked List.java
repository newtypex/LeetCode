// Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
// Memory Usage: 37 MB, less than 98.56% of Java online submissions for Reverse Linked List.

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null) return null;
        else return reverse (head);
    }
    
    private ListNode reverse (ListNode node) {
        if (node.next != null ) {
            ListNode temp = node.next;
            temp.next = node;
            return reverse(node.next);
        }
        else return node;
    }
}