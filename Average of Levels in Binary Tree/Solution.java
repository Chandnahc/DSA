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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        List<Double> res = new ArrayList<>();
        average(root,l,0);
        for(List<Integer> i: l){
            Double sum = 0.00000;
            for(int j:i){
                sum+= j;
            }
            res.add((Double)(sum/i.size()));
        }
        return res;
    }

    private void average(TreeNode root, List<List<Integer>> l, int level){
        if(root==null){
            return;
        }
        if(l.size()==level){
            l.add(level, new ArrayList<Integer>());
        }
        l.get(level).add(root.val);
        average(root.left,l,level+1);
        average(root.right,l,level+1);
    }
}