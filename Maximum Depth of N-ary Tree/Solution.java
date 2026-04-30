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
    public int maxDepth(Node root) {
        if(root==null) return 0;
        return maxDep(root,0);
    }
    public int maxDep(Node root,int level){
        if(root.children.isEmpty()){
            return level+1;
        }
        int maxDepth = Integer.MIN_VALUE;
        for(Node i:root.children){
            maxDepth = Math.max(maxDepth,maxDep(i,level+1));
        }
        return maxDepth;
    }
}