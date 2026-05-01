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
    public int findTilt(TreeNode root){
        if(root == null){
            return 0;
        }
        int[] res = findTilt1(root);
        return res[0];
    }
    public int[] findTilt1(TreeNode root) {
        int[] res = new int[2];
        if(root.left == null && root.right == null){
            res[0] = 0;
            res[1] = root.val;
            return res;
        }
        int[] left = root.left != null ? findTilt1(root.left) : new int[]{0,0};
        int[] right = root.right != null ? findTilt1(root.right) : new int[]{0,0};
        res[0] = Math.abs(left[1]-right[1]) + left[0] + right[0];
        res[1] = left[1] + right[1] + root.val;
        return res;
    }
}