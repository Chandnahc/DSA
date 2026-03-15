/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int depth = 1;
        return Math.max(findDepth(root.left,depth),findDepth(root.right,depth));
    }

    private int findDepth(TreeNode root, int currentDepth){
        if(root == null){
            return currentDepth;
        }
        return Math.max(findDepth(root.left,currentDepth+1),findDepth(root.right,currentDepth+1));
    }
}