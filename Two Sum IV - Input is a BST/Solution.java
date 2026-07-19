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
    Set<Integer> s;
    public boolean findTarget(TreeNode root, int k) {
        s = new HashSet<>();
        return isPresent(root,k);
    }

    private boolean isPresent(TreeNode root,int k){
        if(root==null) return false;
        if(s.contains(root.val)) return true;
        s.add(k-root.val);
        return isPresent(root.left,k) || isPresent(root.right,k);
    }
}