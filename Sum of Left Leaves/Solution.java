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
    public int sumOfLeftLeaves(TreeNode root) {
        return addLeft(root,false);
    }

    public int addLeft(TreeNode root,boolean flag){
        if(root==null){
            return 0;
        }
        int val = 0;
        if(flag && root.left==null && root.right==null){
            val = root.val;
        }
        return addLeft(root.left,true) + addLeft(root.right,false) + val;
    }
}