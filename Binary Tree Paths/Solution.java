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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new ArrayList<>();
        if(root == null){
            return null;
        }
        List<String> leftSubTreePaths = binaryTreePaths(root.left);
        List<String> rightSubTreePaths = binaryTreePaths(root.right);
        int v = root.val;
        if(leftSubTreePaths!=null){
            for(String i:leftSubTreePaths){
                l.add(v+"->"+i);
            }
        }
        if(rightSubTreePaths!=null){
            for(String i:rightSubTreePaths){
                l.add(v+"->"+i);
            }
        }
        if(leftSubTreePaths==null && rightSubTreePaths==null){
            l.add(""+v);
        }
        return l;
    }
}