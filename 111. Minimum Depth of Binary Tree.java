// Runtime: 0 ms, faster than 100.00% of Java online submissions
// Memory Usage: 38.2 MB

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
    public int minDepth(TreeNode root) {
        if (root==null) return 0;
        return findMinDepth(root, 1);
    }
    
    int findMinDepth( TreeNode node, int depth) {
        if (node.left == null && node.right == null) return depth;
        else if (node.left==null) return findMinDepth(node.right, depth+1);
        else if (node.right==null) return findMinDepth(node.left, depth+1);
        else return Math.min(findMinDepth(node.left,depth+1), findMinDepth(node.right,depth+1));
    }
}