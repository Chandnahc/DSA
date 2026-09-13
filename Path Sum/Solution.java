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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traverse(root,0,targetSum);
    }

    private boolean traverse(TreeNode root, int currentSum, int targetSum){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            return targetSum == root.val+currentSum;
        }
        return traverse(root.left,currentSum+root.val, targetSum) || traverse(root.right,currentSum+root.val, targetSum);
    }
}