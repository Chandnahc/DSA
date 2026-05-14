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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }
        int val = 0;
        if(root1 == null){
            val = root2.val;
        }else if(root2 == null){
            val = root1.val;
        }else{
            val = root1.val + root2.val;
        }
        return new TreeNode(
            val, mergeTrees(root1!=null ? root1.left:null,root2!=null ?root2.left:null),mergeTrees(root1!=null ? root1.right:null,root2!=null ? root2.right:null)
        );
    }
}