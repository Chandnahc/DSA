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
    TreeNode res;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        traverse(original,cloned,target);
        return res;
    }

    private void traverse(TreeNode t1, TreeNode t2, TreeNode target){
        if(t1==target){
            res = t2;
        }
        if(t1==null){
            return;
        }
        traverse(t1.left,t2.left,target);
        traverse(t1.right,t2.right,target);
    }
}