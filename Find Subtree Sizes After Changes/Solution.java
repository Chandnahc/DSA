class Solution {
    List<Integer>[] tree;
    List<Integer>[] newTree;
    int[] subtreeSize;
    int[] lastSeen;

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;

        tree = new ArrayList[n];
        newTree = new ArrayList[n];
        subtreeSize = new int[n];
        lastSeen = new int[26];

        Arrays.fill(lastSeen, -1);

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
            newTree[i] = new ArrayList<>();
        }

        // Build the original tree
        for (int i = 1; i < n; i++) {
            tree[parent[i]].add(i);
        }

        // Construct the modified tree
        buildTree(0, s);

        // Calculate subtree sizes
        calculateSize(0);

        return subtreeSize;
    }

    private void buildTree(int node, String s) {
        int ch = s.charAt(node) - 'a';

        int previous = lastSeen[ch];

        // Update the nearest ancestor with this character
        lastSeen[ch] = node;

        for (int child : tree[node]) {
            int childChar = s.charAt(child) - 'a';

            int newParent = lastSeen[childChar];

            if (newParent == -1) {
                newParent = node;
            }

            newTree[newParent].add(child);
        }

        // Visit children using the original tree
        for (int child : tree[node]) {
            buildTree(child, s);
        }

        // Backtrack ancestor information
        lastSeen[ch] = previous;
    }

    private int calculateSize(int node) {
        int size = 1;

        for (int child : newTree[node]) {
            size += calculateSize(child);
        }

        return subtreeSize[node] = size;
    }
}
