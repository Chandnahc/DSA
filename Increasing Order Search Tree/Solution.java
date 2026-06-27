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
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> l = new ArrayList<>();
        l.add(new TreeNode());
        createList(root,l);
        // inOrderTraversal(l.get(1));
        return l.get(1);
    }

    // private void inOrderTraversal(TreeNode root){
    //     if(root == null){
    //         System.out.println("null");
    //         return;
    //     }
    //     inOrderTraversal(root.left);
    //     System.out.println(root.val);
    //     inOrderTraversal(root.right);
    // }

    private void createList (TreeNode root, List<TreeNode> l) {
        if(root == null) return;
        createList(root.left,l);
        TreeNode right = root.right;
        root.right = null;
        root.left = null;
        l.get(l.size()-1).left = null;
        l.get(l.size()-1).right = root;
        l.add(root);
        createList(right,l);
    }
}