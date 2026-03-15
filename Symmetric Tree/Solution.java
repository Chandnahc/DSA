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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> l = new ArrayList<Integer>();
        if(root == null){
            return l;
        }
        l.addAll(inorderTraversal(root.left));
        l.add(root.val);
        l.addAll(inorderTraversal(root.right));
        return l;
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
            && isMirror(t1.left, t2.right) // Left's left vs Right's right
            && isMirror(t1.right, t2.left); // Left's right vs Right's left
    }
}