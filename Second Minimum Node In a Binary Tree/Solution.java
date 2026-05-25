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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return -1;
        int[] arr = new int[2];
        arr[0] = Integer.MAX_VALUE;
        arr[1] = Integer.MAX_VALUE;
        boolean maxValueSeen = findSecondMinimum(root,arr);
        
        return arr[1] == Integer.MAX_VALUE && !maxValueSeen || arr[0] == arr[1] ? -1:arr[1];
    }

    public boolean findSecondMinimum(TreeNode root, int[] n){
        if(root == null) return false;
        
        if(root.val < n[0]){
            n[1] = n[0];
            n[0] = root.val;
        }else if(root.val < n[1] && root.val!=n[0]){
            n[1] = root.val;
        }
        boolean leftFlag = findSecondMinimum(root.left,n);
        boolean rightFlag = findSecondMinimum(root.right,n);
        return root.val == Integer.MAX_VALUE || leftFlag || rightFlag;
    }
}