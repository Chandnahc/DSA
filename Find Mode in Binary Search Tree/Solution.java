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
    private int[] freq = new int[200001];
    private int maxFreq = 0;
    public int[] findMode(TreeNode root) {
        traverse(root);
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<200001;i++){
            if(freq[i]==maxFreq) l.add(i-100000);
        }
        return l.stream().mapToInt(Integer::intValue).toArray();

    }

    private void traverse(TreeNode root){
        if(root == null) return;
        freq[root.val+100000]++;
        if(freq[root.val+100000] > maxFreq) maxFreq = freq[root.val+100000];
        traverse(root.left);
        traverse(root.right);
    }
}