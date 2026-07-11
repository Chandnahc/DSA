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
    int foundParent = -1;
    int foundLevel = -1;
    public boolean isCousins(TreeNode root, int x, int y) {
        return letsFind(root,x,y,0,0);
    }

    private boolean letsFind(TreeNode root,int x,int y,int level,int parent){
        if(root == null) return false;
        if(root.val == x || root.val == y){
            if(foundLevel == level && foundParent != parent) return true;
            if(foundLevel == -1){
                foundLevel = level;
                foundParent = parent;
            }
        }
        return letsFind(root.left,x,y,level+1,root.val) || letsFind(root.right,x,y,level+1,root.val);
    }
}