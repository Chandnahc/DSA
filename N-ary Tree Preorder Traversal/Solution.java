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
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> l = new ArrayList<>();
        if(root==null){
            return l;
        }
        l.add(root.val);
        if(root.children!=null){
            for(Node i:root.children){
                l.addAll(preorder(i));
            }
        }
        return l;
    }
}