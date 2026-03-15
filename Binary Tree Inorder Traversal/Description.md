# [94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)

## 🟢 Easy

---

### **Problem Statement**

Given the `root` of a binary tree, return the **inorder traversal** of its nodes' values.

An **inorder traversal** visits nodes in the following order:
1. **Left** Subtree
2. **Root** Node
3. **Right** Subtree

---

### **Example 1**

![Inorder Traversal Example 1](https://assets.leetcode.com/uploads/2024/08/29/tree_1.png)

> **Input:** `root = [1, null, 2, 3]`  
> **Output:** `[1, 3, 2]`

### **Example 2**

![Inorder Traversal Example 2](https://assets.leetcode.com/uploads/2024/08/29/tree_2.png)

> **Input:** `root = [1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9]`  
> **Output:** `[4, 2, 6, 5, 7, 1, 3, 9, 8]`

### **Example 3**

> **Input:** `root = []`  
> **Output:** `[]`

---

### **Constraints**

- The number of nodes in the tree is in the range `[0, 100]`.
- `-100 <= Node.val <= 100`

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$ where $n$ is the number of nodes, as we visit each node exactly once.
* **Space Complexity:** $O(n)$ in the worst case (a skewed tree) for the recursion stack, or $O(\log n)$ for a balanced tree.

---

### **Approach**



#### **1. Recursive Approach (Recommended for simplicity)**
- Define a helper function that takes a node.
- If the node is `null`, return.
- Call the helper on `node.left`.
- Add `node.val` to the result list.
- Call the helper on `node.right`.

#### **2. Iterative Approach (Using a Stack)**
- Use a stack to mimic the recursion.
- Keep pushing all left children to the stack until you reach a leaf.
- Pop from the stack, add the value to the result, and move to the right child.

---

**Topics:** `Stack` | `Tree` | `Depth-First Search` | `Binary Tree`
