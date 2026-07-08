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
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        isBal(root,0);
        return this.flag;
    }

    private int isBal(TreeNode root,int level){
        if(root == null) return level;
        if(this.flag == false) return level;
        int left = isBal(root.left,level+1);
        int right = isBal(root.right,level+1);
        if(Math.abs(left-right)>1) {
            this.flag = false;
            return 0;
        }else{
            return Math.max(left,right);
        }

    }
}