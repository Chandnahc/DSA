/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> al = new ArrayList<>();
        generateTraversal(root,al);
        return al;
    }

    public void generateTraversal(Node root,List al){
        if(root == null){
            return;
        }
        for(Node i:root.children){
            generateTraversal(i,al);
        }
        al.add(root.val);
    }
}