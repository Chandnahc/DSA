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
    private int count = 0;
    public int averageOfSubtree(TreeNode root) {
        getAverage(root);
        return this.count;
    }

    private int[] getAverage(TreeNode root){
        int[] res = new int[2];
        if(root.left == null && root.right == null){
            this.count++;
            return (new int[]{1, root.val});
        }
        int nodeCount = 1;
        int sum = root.val;
        if(root.left!=null){
            int[] temp = getAverage(root.left);
            nodeCount += temp[0];
            sum += temp[1];
        }
        if(root.right!=null){
            int[] temp = getAverage(root.right);
            nodeCount += temp[0];
            sum += temp[1];
        }
        if((sum/nodeCount)==root.val) this.count++;
        res[0] = nodeCount;
        res[1] = sum;
        return res;
    }
}