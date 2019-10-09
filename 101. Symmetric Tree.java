// Runtime: 0 ms, faster than 100.00% of Java online submissions
// Memory Usage: 34.9 MB, less than 100.00% of Java online submissions

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }
    
    boolean isSymmetric(TreeNode l, TreeNode r) {
        if (l==null) return (r==null)?true:false;
        else if (r==null) return false;
        else if (l.val!=r.val) return false;
        else if (!isSymmetric(l.left, r.right)) return false;
        else if (!isSymmetric(l.right,r.left)) return false;
        return true;
    }
}