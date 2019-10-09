// Runtime: 0 ms, faster than 100.00% of Java online submissions
// Memory Usage: 36.3 MB, less than 100.00% of Java online submissions

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
    
    // another recursive exercise...
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null) return false;
        else return hasPathSum(root, sum, 0);
    }
    
    boolean hasPathSum (TreeNode node, int sum, int current) {
        current += node.val;
        if (current==sum && node.left==null && node.right==null) return true;
        else if (node.left!=null && hasPathSum(node.left,sum,current)) return true;
        else if (node.right!=null && hasPathSum(node.right,sum,current)) return true;
        else return false;
    }
}