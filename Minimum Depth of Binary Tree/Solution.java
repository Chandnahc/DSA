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
    int min = 100001;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        traverse(root,0);
        return min;
    }

    private void traverse(TreeNode root,int level){
        if(root==null || min < level) return;
        if(root.left==null && root.right==null){
            if(min > (level+1)) min = level+1;
            return;
        }
        traverse(root.left,level+1);
        traverse(root.right,level+1);
    }
}