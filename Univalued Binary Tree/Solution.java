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
    int val = -1;
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        if(this.val==-1){
            this.val = root.val;
        }else if(this.val!=root.val){
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}